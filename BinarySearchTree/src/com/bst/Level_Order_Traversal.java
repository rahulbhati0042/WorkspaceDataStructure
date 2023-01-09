package com.bst;

import java.util.LinkedList;
import java.util.Queue;

public class Level_Order_Traversal {
	static Node root;
	static Queue<Node> queue = new LinkedList<Node>();

	public static void main(String[] args) {

		int arr[] = { 100, 200, 50, 21, 75, 150, 300, 60, 80, 180, 160, 180 };

		for (int i = 0; i < arr.length; i++)
			insertion(arr[i]);

		queue.add(root);

		while (!queue.isEmpty()) {
			Node n = queue.poll();

			System.out.println(n.data);
			if (n.left != null)
				queue.add(n.left);
			if (n.right != null)
				queue.add(n.right);
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
