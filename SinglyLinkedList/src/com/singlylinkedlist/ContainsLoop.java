package com.singlylinkedlist;

public class ContainsLoop {
	static Node head;

	public static void main(String[] args) {
		head = new Node();
		head.data = 1;
		createNodeList();
		System.out.println("Singly Linked List contain loop :" + hasLoop());
}

	static void createNodeList() {
		Node n1 = new Node();
		Node n2 = new Node();
		Node n3 = new Node();
		Node n4 = new Node();
		n1.data = 10;
		n1.next = n2;
		n2.data = 20;
		n2.next = n3;
		n3.data = 30;
		n3.next = n4;
		n4.data = 40;
		n4.next = n3;

		head.next = n1;

	}

	static boolean hasLoop() {
		Node p1 = new Node();
		Node p2 = new Node();
		if (head == null)
			return false;
		p1 = head.next;
		p2 = head;
		while (p1 != p2) {
			if (p1 == null || p1.next == null)
				return false;
			p2 = p2.next;
			p1 = p1.next.next;
		}
		return true;
	}

}
