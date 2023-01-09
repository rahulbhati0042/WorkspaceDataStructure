package com.bst;

public class Count_LeafNodes {
	static Node root;
	static int countLeafNode = 0;

	public static void main(String[] args) {
		int arr[] = { 100,50,200,25,75,150,250,140,175,160,165 };
		for (int i = 0; i < arr.length; i++)
			insertion(arr[i]);

		leafNode(root);
		System.out.println("Total Leaf Node: " + countLeafNode);
	}

	public static void leafNode(Node t) {

		if (t == null)
			return;

		leafNode(t.left);
		
		if (t.left == null && t.right == null) {
			System.out.println(t.data);
			countLeafNode++;
		}
		leafNode(t.right);
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
