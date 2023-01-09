package com.bst;

public class BST_InOrder_Recursion {
	static Node root;
	 static int copies=0;

	public static void main(String[] args) {
		insertion(100);
		insertion(50);
		insertion(25);
		insertion(75);
		insertion(200);
		insertion(150);
		insertion(175);
		insertion(250);
		inOrder(root);
		System.out.println("Number of copies :"+copies);
	}

	public static void inOrder(Node t) {
		copies++;
		if (t == null)
			return;
		
		inOrder(t.left);
		System.out.println(t.data);
		inOrder(t.right);
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
