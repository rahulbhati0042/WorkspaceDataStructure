package com.arrayproblems;

import java.util.Arrays;

public class MoveAllNegetiveAtEnd {

	public static void main(String[] args) {
		int arr[]= {-8, 9, 5, 10, 2, 6, -7, 7};
		//int arr[]= {1, -1, 3, 2, -7, -5, 11, 6};
		int d =0;
		for(int i= arr.length-1;i>=0;i--){
			if(arr[i]>0) d++;
			else{
				int k = i;
				for(int j=1;j<=d;j++){
					if(arr[k+1]>0){
						int tmp =arr[k];
						arr[k]=arr[k+1];
						arr[k+1]=tmp;
						k=k+1;
					}
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	

}
