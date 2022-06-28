package com.arrayproblems;

import java.util.Arrays;


public class FindMissingAndRepeatingNumber_Method3_Sorting {

	public static void main(String[] args) {
		int [] arr = new int [] {3,1,3};  
		  // sorting input array
		  Arrays.sort(arr);   
		  int n = arr.length;
		  int miss = 0, repeat = 0;
		  for (int i = 0; i < n; ++i)
		    {
		        if(i == n-1)
		             break;
		             
		        if(arr[i] == arr[i+1])
		            repeat = arr[i];
		            
		        if((arr[i+1] - arr[i])!= 1)
		            miss = i+1;
		    }
		  System.out.println("Missing: "+miss+" Repeating: "+repeat);
	}

}
