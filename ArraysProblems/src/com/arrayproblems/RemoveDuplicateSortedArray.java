package com.arrayproblems;

public class RemoveDuplicateSortedArray {

	public static void main(String[] args) {
		int a[] = {1,2,2,2 ,3};
		int n = a.length;
		int i = 0;
	       for(int j = 1;j<n;j++)
	       {
	           if(a[j] != a[i])
	           {
	               i++;
	           }
	           a[i] = a[j];
	       }
	       System.out.println(i+1);

	}

}