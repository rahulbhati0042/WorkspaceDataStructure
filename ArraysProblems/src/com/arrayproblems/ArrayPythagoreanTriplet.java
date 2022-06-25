package com.arrayproblems;

import java.util.ArrayList;

public class ArrayPythagoreanTriplet {

	public static void main(String[] args) {
		int ar[] = { 3, 2, 4, 6, 5 };
		int n = ar.length;
		ArrayList<Integer> arr=new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					// Calculate square of array elements
					int x = ar[i] * ar[i], y = ar[j] * ar[j], z = ar[k] * ar[k];

					if (x == y + z || y == x + z || z == x + y)
						System.out
								.println("array is Pythagorean tripet :" + true);

				}
			}
		}

		System.out.println("No pythagorean triplet");
	}

}
