package com.heapsort;

import java.util.Arrays;

public class ArrayToMinHeap {
	static int arr[] = { 62, 5, 91, 54, 32, 79, 37, 63, 51, 49 };
	public static void main(String[] args) {
		
		getMinHeap();
		System.out.println(Arrays.toString(arr));
	}
	private static void getMinHeap() {
	
		int y = 1;
		int ci=0,ri=0;
		int tmp =0;
		while(y<arr.length){
			
			ci  = y;
			while(ci>0){
				ri  = (ci-1)/2;
				if(arr[ci]<arr[ri]){
					tmp = arr[ci];
					arr[ci] = arr[ri];
					arr[ri] = tmp;
				}
				ci  = ri;
			}
			y++;
		}
		
		
	}
	

}
