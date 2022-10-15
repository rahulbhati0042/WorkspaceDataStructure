package com.arrayproblems;

//Equilibrium Number Index - > whose left hand and right hand side sum is equal
public class EquilibriumNumberIndex {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 8, 10 };
		int left = 0;
		int total = 0;
		int e = 0;
		while (e < arr.length) {
			total = total + arr[e];
			e++;
		}
		e = 0;
		while (e < arr.length) {
			total = total - arr[e];
			if (left == total)
				break;
			left = left + arr[e];
			e++;
		}
		System.out.println("Equilibrium Number Index :"+e);

	}

}
