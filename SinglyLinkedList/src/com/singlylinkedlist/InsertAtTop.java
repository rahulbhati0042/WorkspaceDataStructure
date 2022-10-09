package com.singlylinkedlist;

public class InsertAtTop {
	static Node head;

	public static void main(String[] args) {
		insertAtTop(1);
		insertAtTop(2);
		insertAtTop(3);
		insertAtTop(4);
		Node j = head;
		while (j.next != null) {
			System.out.println(j.data);
			j = j.next;
		}
		System.out.println(j.data);
	}
	public static void insertAtTop(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = head;
		head= newNode;

	}

}
