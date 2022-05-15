package com.arrayproblems;

public class FindMissingNumberFromArray {

	public static void main(String[] args) {
		int arr[]= {3,4,6,2,5,7};
		int sum=0;
		for(int i=0;i<arr.length; i++) {
			sum= sum + arr[i];
		}
		
		int m = arr.length+1;
		int total = m * (m+1)/2;

		int missingValue = total - sum;
		System.out.println("Missing Number := " +missingValue);

	}

}
