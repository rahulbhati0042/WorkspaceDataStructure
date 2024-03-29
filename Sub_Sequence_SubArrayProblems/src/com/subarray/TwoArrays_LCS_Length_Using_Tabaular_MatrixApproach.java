package com.subarray;

import java.util.Arrays;

public class TwoArrays_LCS_Length_Using_Tabaular_MatrixApproach {
	public static void main(String[] args) {
		int x[] = {0, 12, 3, 92, 12, 93, 78 };
		int y[] = { 0,54, 12, 93, 78, 93, 78 };

		int store[][] = new int[x.length ][y.length ];

		int maxSS = 0;

		for (int e = 1; e < x.length; e++) {

			for (int f = 1; f < y.length; f++) {

				if (x[e] == y[f]) {
					store[e][f] = store[e-1][f-1]+1;
				} else {
					store[e][f] = store[e-1][f]>store[e][f-1]?store[e-1][f]:store[e][f-1];
					
				}
				maxSS = Math.max(maxSS, store[e][f]);

			}

		}
		System.out.println("Longest Common SubSequnce Length :"+maxSS);
		for (int e = 0; e < store.length; e++)
			System.out.println(Arrays.toString(store[e]));
		
	}

}
