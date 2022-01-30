package com.insertionsort;
import java.util.Arrays;
public class InsertionSort {
	public static void main(String[] args) {

		int a[] = { 44, 11, 99, 77, 33, 22, 55 };

		for(int i=1;i<a.length;i++) {
			
			int tmp = a[i];
			int j;
			for(j=i; j>0 && a[j-1]>tmp;j--) {
				a[j]=a[j-1];
			}
			a[j]=tmp;
			
		}
		System.out.println(Arrays.toString(a));
	}

}
