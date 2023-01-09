package com.bst;

import java.util.LinkedList;
import java.util.Queue;

public class BST_View_From_Left {
	static Node root;
	static Queue<Node> queue = new LinkedList<Node>();
	static int added = 1;
	public static void main(String[] args) {

		int arr[] = { 100, 200, 50, 21, 75, 150, 300, 60, 80, 180, 160 };

		for (int i = 0; i < arr.length; i++)
			insertion(arr[i]);

		queue.add(root);
		int r = 1;
		int k = 0;
		while (!queue.isEmpty()) {
			r = 1;
			k = 0;
			while (r <= added) {
				Node tmp = queue.poll();
				if (r == 1)
					System.out.println(tmp.data);
				if (tmp.left != null) {
					queue.add(tmp.left);
					k++;
				}
				if (tmp.right != null) {
					queue.add(tmp.right);
					k++;
				}
				r++;
			}
			added = k;
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