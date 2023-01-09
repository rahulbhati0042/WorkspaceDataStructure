package com.bst;

public class BST_Traverse {
	static Node root;

	public static void main(String[] args) {
		insertion(100);
		insertion(50);
		insertion(25);
		insertion(75);
		insertion(200);
		insertion(150);
		insertion(175);
		insertion(250);
		
		traverse(root);
	}

	public static void traverse(Node t){
		if(t==null) return;
		traverse(t.left);
		System.out.println("Left node :"+t.data);
		traverse(t.right);
		System.out.println("Right node :"+t.data);
		
	}
	
	public static void insertion(int data) {
		Node n = new Node();
		n.data = data;
		n.left = n.right = null;
		if (root == null) {
			root = n;
			return;
		}
		Node j = root;
		while (true) {
			if (j.data > n.data) {
				if (j.left == null) {
					j.left = n;
					break;
				} else
					j = j.left;

			} else {
				if (j.right == null) {
					j.right = n;
					break;
				} else
					j = j.right;
			}
		}

	}
}
