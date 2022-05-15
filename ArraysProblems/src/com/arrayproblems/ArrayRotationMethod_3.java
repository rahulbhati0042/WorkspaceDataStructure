package com.arrayproblems;

import java.util.Arrays;

public class ArrayRotationMethod_3 {
	static int[] arr = new int[] { 1, 2, 3, 4, 5 }; // [3,4,5,1,2]
	public static void main(String[] args) {
		
		
		reverse(0,1);
		reverse(2,4);
		reverse(0,4);
		
	}
	
	private static void reverse(int start,int end){
		
		while(start<end){
			int tmp = arr[start];
			arr[start]= arr[end];
			arr[end]= tmp;
			start++;
			end--;
		}
		System.out.println(Arrays.toString(arr));
	}
	
	
	

}
