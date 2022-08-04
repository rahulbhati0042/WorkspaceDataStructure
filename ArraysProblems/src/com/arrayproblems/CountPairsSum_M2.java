package com.arrayproblems;

import java.util.HashMap;

public class CountPairsSum_M2 {
	public static void main(String[] args) {
		int arr[] = { 1, 5, 7, 1 };
		int k = 6;
		int n = arr.length;
		HashMap<Integer, Integer> m = new HashMap<>();
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (m.containsKey(k - arr[i])) {
				count += m.get(k - arr[i]);
			}
			if (m.containsKey(arr[i])) {
				m.put(arr[i], m.get(arr[i]) + 1);
			} else {
				m.put(arr[i], 1);
			}
		}
		System.out.println("Count :"+count);
	}
}
