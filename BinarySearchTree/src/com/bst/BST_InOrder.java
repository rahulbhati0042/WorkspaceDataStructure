package com.bst;

import java.util.Stack;

public class BST_InOrder {
	static Node root;
	static Stack<Node> stack = new Stack<>();

	public static void main(String[] args) {

		int arr[] = { 100, 50, 25, 20, 10, 35, 75, 70, 60, 90, 85, 95, 200,
				150, 175, 250, 300 };
		for (int i = 0; i < arr.length; i++)
			insertion(arr[i]);

		Node j = root;
		while (j != null) {
			stack.add(j);
			j = j.left;
		}
		while (!stack.isEmpty()) {
			Node n = stack.pop();
			if (n.right != null) {
				Node rightAllLeftExclusive = n.right;
				stack.add(rightAllLeftExclusive);
				while (rightAllLeftExclusive.left != null) {
					stack.add(rightAllLeftExclusive.left);
					rightAllLeftExclusive = rightAllLeftExclusive.left;
				}
			}
			System.out.println(n.data);
		}
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
