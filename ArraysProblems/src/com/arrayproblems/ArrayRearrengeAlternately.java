package com.arrayproblems;

import java.util.Arrays;

public class ArrayRearrengeAlternately {

	public static void main(String[] args) {

		//int a[]= {1,2,3,4,5,6};
		int a[]= {10,20,30,40,50,60,70,80,90,100,110};
		for(int i=0; i< a.length;i=i+2){
			
			int temp = a[a.length-1];
			
			for(int j = a.length-1 ; j > i; j--){
				
				a[j]= a[j-1];
				
			}
			a[i]=temp;
			
		}
	System.out.println(Arrays.toString(a));
	}
	 

}
