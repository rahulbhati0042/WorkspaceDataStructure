package com.arrayproblems;

public class JumpingCaterpillars {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 5 };
		int n = 10;
		int k = 3;
		int tmp[] = new int[n];
		int uneaten = 0;
		for (int i = 0; i < k; i++) {
			int c = (int) arr[i];
			for (int j = c-1; j < n; j = j + c) {
				tmp[j] = 1;
			}
		}
		for (int i = 0; i < tmp.length; i++) {
			if (tmp[i] == 0)
				uneaten++;
		}
		System.out.println("uneaten :" +uneaten);
	}

}
