package com.singlylinkedlist;

public class InsertAtPerticularPossition {
	static Node head;

	public static void main(String[] args) {
		insertAtPerticularPossition(1, 1);
		insertAtPerticularPossition(2, 2);
		insertAtPerticularPossition(3, 3);
		insertAtPerticularPossition(4, 4);
		insertAtPerticularPossition(0,55);
		insertAtPerticularPossition(3,66);
		Node j = head;
		while (j.next != null) {
			System.out.println(j.data);
			j = j.next;
		}
		System.out.println(j.data);
	}

	private static void insertAtPerticularPossition(int position, int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;

		if (head == null) {
			head = newNode;
			return;
		}
		if (position < 0) {
			position = 0;
		}
		Node p1 = new Node();
		Node p2 = new Node();
		int x;
		for (p1 = head, x = 1; p1 != null && x <= position; x++) {
			p2 = p1;
			p1 = p1.next;
		}
		if (p1 == null) {
			p2.next = newNode;
			return;
		}
		if (p1 == head) {
			newNode.next = head;
			head = newNode;
			return;
		}
		newNode.next = p1;
		p2.next = newNode;
	}
}
