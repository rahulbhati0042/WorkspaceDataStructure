package com.singlylinkedlist;

public class MergeTwoSLL {
	static Node head;

	public static void main(String[] args) {
		Node head1 = new Node();
		Node head2 = new Node();
		Node head3 = new Node();
		Node t = new Node();
		int x[] = { 10, 20, 30, 40, 50, 60, 70 };
		int y[] = { 5, 7, 19, 25, 36, 54, 80, 90, 120, 130 };
		head1 = createLinkedList(x);
		head2 = createLinkedList(y);
		head3 = merge(head1, head2);
		Node j = head3;
		while (j.next != null) {
			System.out.println(j.data);
			j = j.next;
		}
		System.out.println(j.data);
	}

	private static Node createLinkedList(int[] x) {
		Node head = null;
		Node t = null;
		Node end = null;
		int size = x.length;
		for (int i = 0; i < size; i++) {
			t = new Node();
			t.data = x[i];
			if (head == null) {
				head = end = t;
			} else {
				end.next = t;
				end = t;
			}
		}
		return head;

	}

	private static Node merge(Node head1, Node head2) {
		Node head3 = null;
		Node end3 = null;
		Node t1 = head1;
		Node t2 = head2;
		Node j = null;
		while (t1 != null && t2 != null) {
			if (t1.data <= t2.data) {
				j = t1;
				t1 = t1.next;
			} else {
				j = t2;
				t2 = t2.next;
			}
			j.next = null;
			if (head3 == null) {
				head3 = end3 = j;
			} else {
				end3.next = j;
				end3 = j;
			}
			if (t1 != null)
				end3.next = t1;
			if (t2 != null)
				end3.next = t2;

		}
		return head3;

	}
}
