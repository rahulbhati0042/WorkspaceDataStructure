package com.arrayproblems;


public class SecondLargestFromArray {

	public static void main(String[] args) {
		int arr[] =  {12, 35, 1, 10, 34, 1};
		int n = arr.length;
		int first = -1;
		int second = -1;
		for(int i=0; i<n; i++){
			if(first<arr[i]){
				second=first;
				first= arr[i];
			}else if(first>arr[i] && second<arr[i]){
				second=arr[i];
			}
		}
		System.out.println("Second Largest Elements: "+second);
		
	}

}
