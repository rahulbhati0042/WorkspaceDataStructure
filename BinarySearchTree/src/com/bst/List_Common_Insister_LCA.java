package com.bst;

import java.util.LinkedList;
import java.util.Queue;

public class List_Common_Insister_LCA {
	static Node root;
	static int levels = 0;
	static Queue<Integer> q1 = new LinkedList<Integer>();
	static Queue<Integer> q2 = new LinkedList<Integer>();
	static int lastRemovedElements = 0;
	static Queue<Node> queue = new LinkedList<Node>();

	public static void main(String[] args) {
		int arr[] = { 10, 8, 15, 7, 9, 14, 16, 18 };
		for (int i = 0; i < arr.length; i++)
			insertion(arr[i]);
		queue.add(root);
		int a = 14;
		int b = 16;
		while (!queue.isEmpty()) {
			Node n = queue.poll();
			if (n.left != null)
				queue.add(n.left);
			if (n.right != null)
				queue.add(n.right);
			q1.add(n.data);
			if (n.data == a)
				break;

		}
		queue.clear();
		queue.add(root);
		while (!queue.isEmpty()) {
			Node n = queue.poll();
			if (n.left != null)
				queue.add(n.left);
			if (n.right != null)
				queue.add(n.right);
			q2.add(n.data);
			if (n.data == b)
				break;

		}
		lastRemovedElements = getLCA(root);
		System.out.println("LCA :" + lastRemovedElements);
	}

	private static int getLCA(Node root) {

		while (!q1.isEmpty() && !q2.isEmpty()) {
			int a = q1.poll();
			int b = q2.poll();
			if (a == b) {
				lastRemovedElements = a;
			} else {
				break;
			}

		}
		return lastRemovedElements;

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
