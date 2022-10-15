package com.arrayproblems;

//Equilibrium Number Index - > whose left hand and right hand side sum is equal
public class EquilibriumNumberIndex_SecondApproach {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 8, 10 };
		int left = 0, right = 0;
		int total = 0;
		int lb = 0, ub = arr.length-1;
		int e = 0;
		while (e < arr.length) {
			total = total + arr[e];
			e++;
		}
		int index = -1;
		while (lb < ub) {

			if (left == total - (left + arr[lb])) {
				index = lb;
				break;
			} else if (right == total - (right + arr[ub])) {
				index = ub;
				break;
			}
			left = left + arr[lb];
			right = right + arr[ub];
			lb++;
			ub--;
		}

		System.out.println("Equilibrium Number Index :" + index);

	}

}
