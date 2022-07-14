package com.arrayproblems;

import java.util.Arrays;


public class SmallestPositiveMissingNumber_Method3_Sort {

	public static void main(String[] args) {
	int arr[] = {0,-10,1,3,-20};
	int missing =1;
	Arrays.sort(arr);
	
	 for(int i=0; i<arr.length; i++){
       if(arr[i]==missing) missing++;
     }
    System.out.println("Missing :"+missing);

	}

}
