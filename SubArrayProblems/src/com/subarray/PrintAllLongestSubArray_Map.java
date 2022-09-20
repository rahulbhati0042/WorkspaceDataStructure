package com.subarray;

import java.util.HashMap;
import java.util.Map;

public class PrintAllLongestSubArray_Map {

	public static void main(String[] args) {
		int arr[] = { 12, 3, 92, -3, 76, 54, 12, 93, 78 };
		int previous = 0;
		int e = 0;
		int f = 0;
		int numberOfElements = 0;
		int maxSubSequence = 0;
		int flag[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		Map<Integer, Integer> list = new HashMap<Integer, Integer>();

		for (e = 0; e <= 7; e++) {
			if (flag[e] == 1)
				continue;
			previous = e;
			numberOfElements = 0;
			for (f = e + 1; f <= 8; f++) {
				if (arr[f] > arr[previous]) {
					previous = f;
					flag[f] = 1;
					numberOfElements++;
				}
			}
			if (previous > e) {
				numberOfElements++;
			}
			if (numberOfElements < maxSubSequence)
				continue;
			if (numberOfElements > maxSubSequence) {
				maxSubSequence = numberOfElements;
				list.clear();
			}
			list.put(e, previous);
	}
		for (Map.Entry<Integer, Integer> entry : list.entrySet()) {
			System.out.println("Start and end index " + entry.getKey() + " & "
					+ entry.getValue());
			e = entry.getKey();
			previous = e;
			for (f = e + 1; f <= entry.getValue(); f++) {
				if (arr[f] > arr[previous]) {
					System.out.print("("+previous+")"+arr[previous] + " ,");
					previous = f;
				}
			}
			System.out.print("("+previous+")"+arr[previous]);
			System.out.println();
		}
	}
}
