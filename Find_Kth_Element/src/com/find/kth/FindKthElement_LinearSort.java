package com.find.kth;

public class FindKthElement_LinearSort {

	public static void main(String[] args) {
		int arr[] = { 62, 37, 49, 39, 33, 63, 91, 5, 17, 84 };
		//5,17,33,37,39,49,62,63,84,91
		int kth = 7;
		int e = 0, f =0,tmp =0;
		while(e<kth){
			f = e+1;
			while(f<arr.length){
				if(arr[e]>arr[f]){
					tmp = arr[e];
					arr[e]=arr[f];
					arr[f]=tmp;
				}
				f++;
			}
			e++;
		}
		System.out.println("Kth Smallest :" + arr[e-1]);
	}

}