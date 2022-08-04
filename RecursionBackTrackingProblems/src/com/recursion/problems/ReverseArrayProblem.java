package com.recursion.problems;

import java.util.Arrays;

public class ReverseArrayProblem {
	static int arr[] = { 1, 2, 3, 4, 5 };
	public static void main(String[] args) {
		
		reverse(0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}
	private static void reverse(int l,int r){
		if(l>=r) 
			return;
		int temp = arr[l];
		arr[l] = arr[r];
		arr[r]  = temp;
		reverse(l+1, r-1);
	}
}
