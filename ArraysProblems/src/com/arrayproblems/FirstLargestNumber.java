package com.arrayproblems;

public class FirstLargestNumber {
	public static void main(String[] args) {
		int a[]={45,43,75,51,66,29,90};
		int f = a[0];
		for(int i=1;i<a.length;i++){
			if(f<a[i]){
				f = a[i];
				
			}
		}
		System.out.println("Largest Number: "+f);
	}
}
