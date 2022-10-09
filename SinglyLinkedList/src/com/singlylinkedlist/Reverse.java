package com.singlylinkedlist;

public class Reverse {
	static Node head;
	public static void main(String[] args) {
		insertAtPerticularPossition(1, 100);
		insertAtPerticularPossition(2, 200);
		insertAtPerticularPossition(3, 300);
		insertAtPerticularPossition(4, 400);
		insertAtPerticularPossition(5, 500);
		
		System.out.println("Before Reverse");
		Node j = head;
		while (j.next != null) {
			System.out.println(j.data);
			j = j.next;
		}
		System.out.println(j.data);
		System.out.println("After Reverse");
		Node reversedNode = reverse();
		while (reversedNode != null) {
			System.out.println(reversedNode.data);
			reversedNode = reversedNode.next;
		}
}
private static Node reverse() {
		Node t = new Node();
		Node newHead = null;
		while (head != null) {
			t = head;
			head = head.next;
			t.next = newHead;
			newHead = t;
		}
		return newHead;
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
