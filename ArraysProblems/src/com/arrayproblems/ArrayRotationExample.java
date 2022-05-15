package com.arrayproblems;

import java.util.Arrays;

public class ArrayRotationExample {
	
	public static void main(String[] args) {
		
		int[] arr=new int[]{1,2,3,4,5};  //[3,4,5,1,2]
		
		int[] tmp = new int[2];
		
		int[] expectedArr = new int[5];
		
		for(int i=0;i<2;i++){
			tmp[i]= arr[i];  //tmp[1,2]
		}
		int j=0;
		for(int i=2;i<arr.length;i++,j++){
			expectedArr[j]= arr[i];  //3,4,5
		}
		for(int i=0;i<tmp.length;i++,j++){
			expectedArr[j]=tmp[i]; //3,4,5,1,2
		}
		System.out.println(Arrays.toString(expectedArr));
					
	}

}
