package com.singlylinkedlist;

public class RemoveDuplicate {
	static Node head;

	public static void main(String[] args) {
		insertAtPerticularPossition(1, 200);
		insertAtPerticularPossition(2, 200);
		insertAtPerticularPossition(3, 400);
		insertAtPerticularPossition(4, 400);
		insertAtPerticularPossition(5, 500);

		System.out.println("Before removeDuplicate");
		Node j = head;
		while (j.next != null) {
			System.out.println(j.data);
			j = j.next;
		}
		System.out.println(j.data);
		System.out.println("After removeDuplicate");
		removeDuplicate();
		 j = head;
		while (j.next != null) {
			System.out.println(j.data);
			j = j.next;
		}
	}

	private static void removeDuplicate() {
		Node p1= new Node();
		Node p2= new Node();
		Node t =new Node();
		Node j =new Node();
		p2 = p1= head;
		while(p2!=null){
			p1 = p2;
			while(p1!=null && p1.data== p2.data){
				p1= p1.next;
			}
			t = p2.next;
			while(t!=p1){
				j = t;
				t = t.next;
			}
			p2.next=p1;
			p2=p1;
		}
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
