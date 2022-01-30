package com.linearsort;

import java.util.Arrays;

public class LinearSort {
	public static void main(String[] args) {
		int a[] = { 44, 11, 99, 77, 33, 22, 55 };
		
		for(int i=0; i< a.length;i++) {
			
			for(int j = i+1; j<a.length; j++) {
				int tmp= 0;
				if(a[i]>a[j]) {
					tmp= a[i];
					a[i] = a[j];
					a[j]= tmp;
				}
				
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
