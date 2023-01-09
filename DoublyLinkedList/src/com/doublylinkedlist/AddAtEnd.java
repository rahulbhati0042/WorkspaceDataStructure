package com.doublylinkedlist;

public class AddAtEnd {
	static Node head;
	static Node tail;

	public static void main(String[] args) {
		addAtEnd(1);
		addAtEnd(2);
		addAtEnd(3);
		addAtEnd(4);
		System.out.println(" **** Add at End **** ");
		Node j = null;
		for (j = head; j != null; j = j.next)
			System.out.println(j.data);

	}

	public static void addAtEnd(int data) {
		Node n = new Node();
		n.data = data;
		n.next = n.prev = null;

		if (head == null) {
			head = tail = n;
		} else {
			tail.next = n;
			n.prev = tail;
			tail = n;
		}
	}
}