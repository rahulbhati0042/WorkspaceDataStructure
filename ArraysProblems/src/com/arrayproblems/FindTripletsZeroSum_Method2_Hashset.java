package com.arrayproblems;

import java.util.HashSet;

public class FindTripletsZeroSum_Method2_Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 97, -27, 2, -34, 61, -39 };
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			HashSet<Integer> s = new HashSet<Integer>();
			for (int j = i + 1; j < n; j++) {

				int x = -(arr[i] + arr[j]);
				if (s.contains(x)) {
					System.out.println("Triplets");
					break;
				} else {
					s.add(arr[j]);
				}
			}
		}
		// System.out.println("Not Triplets");
	}

}
