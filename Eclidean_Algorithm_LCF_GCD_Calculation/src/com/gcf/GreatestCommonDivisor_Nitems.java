package com.gcf;

public class GreatestCommonDivisor_Nitems {

	public static void main(String[] args) {
		int arr[] = {14, 21, 42, 49,77};
		int hcf = 0;
		int e = 1;
		while (e < arr[0]) {

			boolean isDivisible = false;
			int f = 0;
			while (f < arr.length) {
				if (arr[f] % e != 0) {
					isDivisible = false;
					break;
				}
				isDivisible = true;
				f++;
			}
			if (isDivisible) {
				hcf = e;
			}

			e++;
		}
		System.out.println(hcf);

	}

}