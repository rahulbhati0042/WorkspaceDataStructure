package com.bst;

import java.util.LinkedList;
import java.util.Queue;

public class Level_Order_Traversal_With_Level_Number {
	static Node root;
	static Queue<Node> queue = new LinkedList<Node>();
	static int levelNumber = 0;

	public static void main(String[] args) {

		int arr[] = { 100, 50, 200, 25, 75, 150, 250, 4, 35, 85, 300 };

		for (int i = 0; i < arr.length; i++)
			insertion(arr[i]);

		queue.add(root);
		queue.add(new Node());
		while (!queue.isEmpty()) {
			Node n = queue.poll();
			if (n.data != 0)
				System.out.println(" At Level :"+ levelNumber +" & Data :"+n.data);
			if (!queue.isEmpty() && n.data == 0) {
				levelNumber++;
				queue.add(new Node());
			}
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
