package com.doublylinkedlist;

public class InsertAtPerticularPossition {
	static Node head;
	static Node tail;

	public static void main(String[] args) {
		insertAtPerticularPossition(1, 1);
		insertAtPerticularPossition(2, 2);
		insertAtPerticularPossition(3, 3);
		insertAtPerticularPossition(4, 4);
		insertAtPerticularPossition(1,55);
		insertAtPerticularPossition(3,66);
		System.out.println(" **** Insert At Perticular Possition **** ");
		Node j = null;
		
		for (j = head; j != null; j = j.next)
			System.out.println(j.data);

	}

	private static void insertAtPerticularPossition(int position, int data) {
		Node n = new Node();
		n.data = data;
		n.next = n.prev = null;
		if (head == null) {
			head = tail = n;
			return;
		}
		if (position < 0) {
			position = 0;
		}
		int x = 1;
		Node k = head;
		while (k != null && x < position) {
			k = k.next;
			x++;
		}
		if (k == head) {
			n.next = head;
			head.prev = n;
			head = n;
			return;
		}
		if (k == null) {
			tail.next = n;
			n.prev = tail;
			tail = n;
			return;
		}
		n.next=k;
		n.prev= k.prev;
		k.prev.next=n;
		k.prev=n;
	}

}
