package com.arrayproblems;

import java.util.Arrays;

public class MoveZeroesToEndArrays {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 0, 0, 0, 3, 6 };
		int count = 0;
		int temp;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=0){
			temp= arr[count];
			arr[count]=arr[i];
			arr[i]= temp;
			count=count+1;
		}
		}
		System.out.println(Arrays.toString(arr));
	}

}
