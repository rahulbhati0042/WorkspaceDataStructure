package com.find.kth;

public class FindKthElement_Partition {

	public static void main(String[] args) {
		int arr[] = { 44, 11, 99, 77, 33, 22, 55 };
		int result = findKth_Smallest(arr, 1);
		System.out.println("Kth Smallest :" + result);
	}
	private static int findKth_Smallest(int arr[], int kth) {
		boolean swapHappend=true;
		int e=0;
		int target = kth-1;
		int tmp=0;
		while(swapHappend){
			swapHappend =false;
			e=0;
			while(e<target){
				if(arr[e]>arr[target]){
					tmp = arr[e];
					arr[e] = arr[target];
					arr[target]  = tmp;
					 swapHappend=true;
				}
				e++;
			}
			e=arr.length-1;
			while(e>target){
				if(arr[e]<arr[target]){
					tmp = arr[e];
					arr[e] = arr[target];
					arr[target]  = tmp;
					 swapHappend=true;
				}
				e--;
			}}
		return arr[target];
	}
}
