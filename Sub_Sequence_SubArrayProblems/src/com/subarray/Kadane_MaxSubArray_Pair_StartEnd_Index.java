package com.subarray;

public class Kadane_MaxSubArray_Pair_StartEnd_Index {

	public static void main(String[] args) {
		int arr[] = { 10, -2, 3, 7, -5, 8, 6, -2 };
		int localMax = arr[0];
		int globalMax = arr[0];
		int e = 1;
		int si=0,ei=0;
		while (e < arr.length) {

			if (arr[e] > (localMax + arr[e])) {
				localMax = arr[e];
				si=e;

			} else {
				localMax = localMax + arr[e];
				
			}
			if (localMax > globalMax){
				globalMax = localMax;
				ei = e;
			}

			e++;
		}
		System.out.println("Start index :("+si+")");
		System.out.println("End index :("+ei+")");
		System.out.println(globalMax);
	}

}
