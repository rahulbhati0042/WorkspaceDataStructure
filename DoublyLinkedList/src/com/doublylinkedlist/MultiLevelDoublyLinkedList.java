package com.doublylinkedlist;

//pending
public class MultiLevelDoublyLinkedList {
	static Node head;
	static Node tail;
	static int count = 0;
	static class Node {
		int data;
		Node child;
		Node next;
		Node prev = null;
	}

	public static void main(String[] args) {

		int arr[] = { 10, 50, 5, 70, 62, 93, 84, 0, 0, 0, 6, 50, 0, 0, 67 };
		for (int i = 0; i < arr.length; i++) {

			addAtEnd(arr[i]);
		}
		Node j = null;
		for (j = head; j != null; j = j.next)
			System.out.println(j.data);

	}

	public static void addAtEnd(int data) {
		Node n = new Node();
		n.data = data;
		n.next = n.child = n.prev = null;
		
		if (head == null) {
			head = tail = n;
		} else if (data != 0) {
			if (count == 0) {
				tail.next = n;
				n.prev = tail;
				tail = n;
			} else {
				Node j = head;
				while (count >0) {
					j = j.next;
					count--;
				}
				
				j.prev.child = tail = n;
				j.prev.child.prev = tail.prev = j.prev;
				System.out.println("ok");
			}
		} else {
			count++;

		}

	}
}
