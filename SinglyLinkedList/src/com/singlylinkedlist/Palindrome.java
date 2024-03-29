package com.singlylinkedlist;

public class Palindrome {
	static Node head;

	public static void main(String[] args) {
		head = new Node();
		head.data = 1;
		createNodeList();
		System.out.println("Is palindrome :"+ isPalindrome(head));
	}

	private static boolean isPalindrome(Node head2) {
		Node p1=new Node();
		Node p2=new Node();
		Node top =new Node();
		Node t=new Node();
		top = null;
		int count;
		if(head==null) return false;
		if(head.next==null) return true;
		p2 = head;
		p1 = p2.next;
		count=1;
		//push to the stack
		Node newNode=new Node();
		newNode.data=p2.data;
		newNode.next=top;
		top = t;
		while(p1!=null){
			p2 = p2.next;
			//push a node on stack
			t=new Node();
			t.data=p2.data;
			t.next  = top;
			top = t;
			if(p1.next==null){
				count++;
				break;
			}
			count = count+2;
			p1= p1.next.next;
			
		}
		if(count%2==0){
			//pop a node from stack
			t = top;
			top = top.next;
			
		}
		while(p2!=null){
			if(p2.data!=top.data){
				releaseNode(top);
				return false;
				
			}
			t = top;
			top = top.next;
			p2=p2.next;
		}
		return true;
	}

	private static void releaseNode(Node b) {
		// TODO Auto-generated method stub
		Node t =new Node();
		while(b!=null){
			t = b;
			b= b.next;
		}
	}

	static void createNodeList() {
		Node n1 = new Node();
		Node n2 = new Node();
		Node n3 = new Node();
		Node n4 = new Node();
		Node n5 = new Node();
		head.next = n1;
		n1.data = 10;
		n1.next = n2;
		n2.data = 20;
		n2.next = n3;
		n3.data = 20;
		n3.next = n4;
		n4.data = 10;
		n4.next = n5;;
		n5.data = 1;
		n5.next=null;

	

	}
}
