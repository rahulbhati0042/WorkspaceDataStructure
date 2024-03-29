package com.shellsort;

import java.util.Arrays;

public class ShellSort_WhileLoop {

	public static void main(String[] args) {
		int a[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int y = 1;
		int z = 0;
		int num = 0;
		int lb = 0;
		int ub = a.length - 1;
		int diff = a.length / 2;
		while (diff >= 1) {
			y = lb + diff;
			while (y <= ub) {
				num = a[y];
				z = y - diff;
				while (z >= 0 && a[z] > num) {

					a[z + diff] = a[z];
					z = z - diff;
				}
				a[z + diff] = num;
				y = y + diff;
			}
			diff = diff / 2;
		}
		System.out.println(Arrays.toString(a));
	}
	

}
