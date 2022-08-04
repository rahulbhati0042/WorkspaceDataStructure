package com.recursion.problems;

import java.util.Arrays;

public class ReverseArrayProblem_Method2_SingleVariable {
	static int arr[] = { 1, 2, 3, 4, 5 };
	public static void main(String[] args) {
		
		reverse(0, arr.length);
		System.out.println(Arrays.toString(arr));
	}
	private static void reverse(int i,int n){
		if(i>=n/2) 
			return;
		int temp = arr[i];
		arr[i] = arr[n-i-1];
		arr[n-i-1]  = temp;
		reverse(i+1, n);
	}
}
