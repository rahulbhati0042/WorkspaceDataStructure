package com.arrayproblems;

import java.util.Arrays;

public class FrequenciesOfArrayElements {

	public static void main(String[] args) {
		int arr[] = { 3, 2, 2, 2, 1 };
		int p[] = new int[3];
		int N = arr.length;
		int P = 3;
		int count = 0;
		int k = 0;
		for (int i = 1; i <= P; i++) {
			count = 0;
			for (int j = 0; j < N; j++) {
				if (i == arr[j]) {

					count = count + 1;
				}
			}
			p[k] = count;
			k = k + 1;
		}
		 for(int i=0; i<P; i++){
	           arr[i] = p[i];
	       }
		 System.out.println(Arrays.toString(p));
	}
}
