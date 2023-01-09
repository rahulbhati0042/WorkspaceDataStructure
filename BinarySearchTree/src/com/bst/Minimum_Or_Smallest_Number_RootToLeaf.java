package com.bst;

public class Minimum_Or_Smallest_Number_RootToLeaf {
	static Node root;
	static int smallestPath = 1;;
	static int minPathNumber = Integer.MAX_VALUE;

	public static void main(String[] args) {
		int arr[] = { 10, 50, 200, 75, 150, 250, 5, 4, 3, 2, 1, 85, 300 };
		// int arr[] = { 10, 8, 15, 7, 9, 13, 16, 11, 14 };
		for (int i = 0; i < arr.length; i++)
			insertion(arr[i]);

		String str = "" + root.data;
		smallestPath = smallestPath(root, smallestPath, str);
		System.out.println("Smallest Path Num :" + minPathNumber);
	}

	public static int smallestPath(Node t, int num, String str) {
		String l = str;
		String r = str;
		if (t.left == null && t.right == null) {
			System.out.println(str);
			minPathNumber = Math.min(num, minPathNumber);
			return num;
		}
		int left = num;
		int right = num;
		if (t.left != null) {
			l = l + "->" + t.left.data;
			left = smallestPath(t.left, num + 1, l);
		}
		if (t.right != null) {
			r = r + "->" + t.right.data;
			right = smallestPath(t.right, num + 1, r);
		}
		return Math.min(left, right);
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
