package com.singlylinkedlist;

public class FindMiddleNode {
	static Node head;

	public static void main(String[] args) {
		head = new Node();
		head.data = 1;
		createNodeList();
		System.out.println("Middle Node :"+ getMiddleNode());
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
		n4.next = null;

		head.next = n1;

	}

	static int getMiddleNode() {
		Node p1 = new Node();
		Node p2 = new Node();
		Node p3 = new Node();
		int count;
		if (head == null)
			return 0;
		if (head.next == null)
			return head.data;
		p1 = head.next;
		p2 = head;
		count = 1;
		while (p1 != null) {
			p3 = p2;
			p2 = p2.next;
			if (p2.next == null) {
				count++;
				break;
			}
			p1 = p1.next.next;
			count = count + 2;
		}
		System.out.println("count :" + count);
		if (count % 2 == 0)
			return p3.data;
		return p2.data;
	}
}