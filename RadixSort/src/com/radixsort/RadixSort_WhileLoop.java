package com.radixsort;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RadixSort_WhileLoop {
	int getMax(int a[], int n) {  
		   int max = a[0];  
		   for(int i = 1; i<n; i++) {  
		      if(a[i] > max)  
		         max = a[i];  
		   }  
		   return max; //maximum element from the array  
		}  
		  
	public static void main(String[] args) {
		 int a[] = {151, 259, 360, 91, 115, 706, 34, 858, 2};  
		  int n = a.length;  
		 radixsort(a, n);
	
	}
	private static void radixsort(int a[], int n) {  
		
	}
	
}
