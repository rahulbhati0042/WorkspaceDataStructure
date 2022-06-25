package com.arrayproblems;

public class ArrayEquilibriumPointMethod2 {
	public static void main(String[] args) {
		long arr[]={20 ,17 ,42 ,25 ,32 ,32 ,30 ,32 ,37 ,9, 2 ,33 ,31 ,17 ,14 ,40 ,9 ,12
				,36 ,21 ,8 ,33 ,6 ,6 ,10 ,37 ,12 ,26 ,21, 3};
		  long sum = 0; // initialize sum of whole array 
	        long leftsum = 0; // initialize leftsum 
	  
	        /* Find sum of the whole array */
	        for (int i = 0; i < arr.length; i++) 
	            sum += arr[i]; 
	  
	        for (int i = 0; i < arr.length; i++) { 
	            sum =sum- arr[i]; // sum is now right sum for index i 
	  
	            if (leftsum == sum) 
	               System.out.println("point :"+(i+1));
	  
	            leftsum =leftsum+ arr[i]; 
	        } 
	  
	        /* If no equilibrium index found, then return 0 */
	      System.out.println("sorry");
	}
}
