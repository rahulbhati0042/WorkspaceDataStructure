package com.arrayproblems;

import java.util.Arrays;

public class AverageInStream {

	public static void main(String[] args) {
		int arr[] = {10, 20, 30, 40, 50};
		System.out.println(Arrays.toString(streamAvg(arr, 5)));
		
	}

	public static float[] streamAvg(int[] arr, int n) {
		float item[]=new float[n];
	       for(int i=0; i<n; i++){
	           float sum = 0;
	           for(int j=0; j<=i; j++){
	               sum = (float)sum + arr[j];
	           }
	           item[i] = sum/(i+1);
	           
	       }
	       return item;
	}

}
