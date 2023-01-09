package com.bst;

public class BST_PostOrder_Recursion {
	static Node root;
	public static void main(String[] args) {
		//int arr[] = { 100, 50, 25, 75, 200, 150, 140, 175, 250, 160, 165 };
		int arr[] = { 100, 200, 50, 21, 75, 150, 300, 60, 80, 180, 160, 180 };
		for (int i = 0; i < arr.length; i++)
			insertion(arr[i]);
		postOrder(root);
	
	}

	public static void postOrder(Node t) {
		if (t == null)
			return;
		
		postOrder(t.left);
		postOrder(t.right);
		System.out.println(t.data);
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
