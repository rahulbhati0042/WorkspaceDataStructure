package com.doublylinkedlist;

public class RemoveAtPerticularPossition {
	static Node head;
	static Node tail;

	public static void main(String[] args) {
		addAtEnd(1);
		addAtEnd(2);
		addAtEnd(3);
		addAtEnd(4);
		System.out.println("**** After remove ****");
		removeAtPerticularPossition(4);
		Node j = null;
		for (j = head; j != null; j = j.next)
			System.out.println(j.data);
	}

	private static boolean removeAtPerticularPossition(int position) {
		int x;
		if (position < 1)
			return false;
		x = 1;
		Node k = head;
		while (k != null && x < position) {
			k = k.next;
			x++;
		}
		if (k == null) {
			return false;
		}if(k==head && k==tail){
			head = tail =null;
			return true;
		}if(k==head){
			head = head.next;
			head.prev=null;
			return true;
		}if(k==tail){
			tail =tail.prev;
			tail.next = null;
			return true;
		}
		k.prev.next=k.next;
		k.next.prev=k.prev;
		return true;
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