package com.singlylinkedlist;

public class RemoveAtPerticularPossition {
	static Node head;

	public static void main(String[] args) {
		insertAtPerticularPossition(0, 6);
		insertAtPerticularPossition(1, 7);
		insertAtPerticularPossition(2, 8);
		insertAtPerticularPossition(3, 9);
		
		System.out.println("After remove");
		removeAtPerticularPossition(0);
		removeAtPerticularPossition(1);
		Node j = head;
		while (j.next != null) {
			System.out.println(j.data);
			j = j.next;
		}
		System.out.println(j.data);
	}
	private static int removeAtPerticularPossition(int position){
		Node p1=new Node();
		Node p2 =new Node();
		int x;
		if(head==null || position<0) return -1;
		for(p1=head,x=1;p1!=null && x<=position;x++){
			p2 =p1;
			p1=p1.next;
		}
		if(p1==null) return -1;
		if(p1==head){
			head= head.next;
		}else{
			p2.next = p1.next;
		}
		return 1;
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