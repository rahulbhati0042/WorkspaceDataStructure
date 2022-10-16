package com.doublylinkedlist;

public class InsertAtTop {
	static Node head;
	static Node tail;
	public static void main(String[] args) {
		insertAtTop(1);
		insertAtTop(2);
		insertAtTop(3);
		insertAtTop(4);
		System.out.println(" **** Add at Top **** ");
		Node j = null;
		for (j = head; j != null; j = j.next)
			System.out.println(j.data);

	}
	public static void insertAtTop(int data) {
		Node n = new Node();
		n.data = data;
		n.next = n.prev = null;

		if (head == null) {
			head = tail = n;
		} else {
			n.next =head;
			head.prev = n;
			head = n;
		}
	}
}
