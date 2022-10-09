package com.singlylinkedlist;

public class AddAtEnd {
	static Node start;

	public static void main(String[] args) {
		addAtEnd(1);
		addAtEnd(2);
		addAtEnd(3);
		addAtEnd(4);
		Node j = start;
		while (j.next != null) {
			System.out.println(j.data);
			j = j.next;
		}
		System.out.println(j.data);
	}

	public static void addAtEnd(int data) {

		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
		if (start == null) {
			start = newNode;
		} else {
			Node j = start;
			while (j.next != null) {
				j = j.next;
			}
			j.next = newNode;
		}
	}

}
