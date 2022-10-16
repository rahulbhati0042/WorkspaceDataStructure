package com.doublylinkedlist;

public class Travers {
	static Node head;
	static Node tail;

	public static void main(String[] args) {
		addAtEnd(1);
		addAtEnd(2);
		addAtEnd(3);
		addAtEnd(4);
		System.out.println("Traverse Top to Bottom");
		traverseTopToBottom();
		System.out.println("Traverse Bottom to Top");
		traverseBottomToTop();
	}

	private static void traverseTopToBottom() {
		Node t = null;
		for (t = head; t != null; t = t.next) {
			System.out.println(t.data);
		}

	}

	private static void traverseBottomToTop() {
		Node t = null;
		for (t = tail; t != null; t = t.prev) {
			System.out.println(t.data);
		}

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
