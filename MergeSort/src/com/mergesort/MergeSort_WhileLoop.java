package com.mergesort;

import java.util.Arrays;

public class MergeSort_WhileLoop {

	public static void main(String[] args) {
		int arr[] = { 44, 11, 99, 77, 33, 22, 55, 66, 88, 87 };
		int tmpArr[] = new int[10];
		int lb1 = 0, ub1 = 0;
		int lb2 = 0, ub2 = arr.length;
		int lb3 = 0, ub3 = arr.length;
		int i1 = lb1;
		int i2 = lb2;
		int i3 = lb3;
		int a = 0, b = 0;
		int stack1[][] = new int[10][2];
		int stack2[][] = new int[10][2];
		int top1 = 10;
		int top2 = 10;
		int mid = 0;
		top1--;
		stack1[top1][0] = 0;
		stack1[top1][1] = 9;
		while (top1 != 10) {
			a = stack1[top1][0];
			b = stack1[top1][1];

			top1++;
			top2--;
			stack2[top2][0] = a;
			stack2[top2][1] = b;
			// calculate mid
			mid = (a + b) / 2;
			if (a < mid) {
				top1--;
				stack1[top1][0] = a;
				stack1[top1][1] = mid;
			}
			if (mid + 1 < b) {
				top1--;
				stack1[top1][0] = mid + 1;
				stack1[top1][1] = b;
			}
		}
		// /logic to merge
		while (top2 != 10) {
			lb1 = stack2[top2][0];
			ub2 = stack2[top2][1];
			top2++;
			ub1 = (lb1 + ub2) / 2;
			lb2 = ub1 + 1;
			lb3 = lb1;
			ub3 = ub2;
			i1 = lb1;
			i2 = lb2;
			i3 = lb3;
			while (i1 <= ub1 && i2 <= ub2) {
				if (arr[i1] < arr[i2]) {
					tmpArr[i3] = arr[i1];
					i1++;
				} else {
					tmpArr[i3] = arr[i2];
					i2++;
				}
				i3++;
			}
			while (i1 <= ub1) {
				tmpArr[i3] = arr[i1];
				i1++;
				i3++;
			}
			while (i2 <= ub2) {
				tmpArr[i3] = arr[i2];
				i2++;
				i3++;
				
			}
			// copy back
			i3 = lb3;
			while (i3 <= ub3) {
				arr[i3] = tmpArr[i3];
				i3++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
