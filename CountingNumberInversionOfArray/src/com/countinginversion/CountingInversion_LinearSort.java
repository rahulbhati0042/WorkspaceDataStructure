package com.countinginversion;

public class CountingInversion_LinearSort {

	public static void main(String[] args) {
		int arr[] = { 6,4,12,3,32,76,54,19,27,62 };
		int e =0;
		int f=0;
		int inversionCount =0;
		while(e<arr.length){
			f = e+1;
			while(f<arr.length){
				if(arr[e]>arr[f]) inversionCount++;
				f++;
			}
			e++;
		}
		System.out.println(inversionCount);
	}

}