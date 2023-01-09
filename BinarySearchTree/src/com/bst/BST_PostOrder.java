package com.bst;

import java.util.Stack;

public class BST_PostOrder {
	static Node root;
	static Stack<Node> stack = new Stack<>();

	public static void main(String[] args) {
		int arr[] = { 100, 200, 50, 21, 75, 150, 300, 60, 80, 180, 160, 180 };
		for (int i = 0; i < arr.length; i++)
			insertion(arr[i]);
		Node t;
		t = root;
		while (true) {

			while (t != null) {
				if (t.right != null) {
					stack.push(t.right);
				}
				stack.push(t);
				t = t.left;
			}
			t = stack.pop();
			if (!stack.isEmpty() && t.right != null
					&& stack.peek().data == t.right.data) {
				stack.pop();
				stack.push(t);
				t = t.right;
			} else {
				System.out.println(t.data);
				t = null;
			}

			if (stack.isEmpty())
				return;
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
