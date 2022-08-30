package com.insertionsort;

import java.util.Arrays;

public class InsertionSort_WhileLoop {

	public static void main(String[] args) {
		int a[] = { 44, 11, 99, 77, 33, 22, 55 };

		int y = 1;
		while (y < a.length) {
			int num = a[y];
			int z = y - 1;
			while (z >= 0 && a[z] > num) {
				a[z + 1] = a[z];
				z--;
			}
			a[z + 1] = num;

			y++;
		}
		System.out.println(Arrays.toString(a));

	}

}
