package com.array.problems;

public class RangeSum_PreProcessing_Approach {
	//static int arr[] = { 40, 5, 3, 5, 6, 2, 5, 6, 1 };
	static int arr[] = { 5,6,7,10,12,15,5,8 };
	static int[] preProcessing = new int[arr.length];
	public static void main(String[] args) {
		
		int e=1;
		preProcessing[0] = arr[0];
		while(e<arr.length){
			preProcessing[e] = preProcessing[e-1]+arr[e];
			e++;
		}
		System.out.println("Rang sum (0,4) :" + RangSum(0, 4));
		System.out.println("Rang sum (3,4) :" + RangSum(3, 4));
		System.out.println("Rang sum (4,4) :" + RangSum(4, 4));
		System.out.println("Rang sum (5,7) :" + RangSum(5, 7));
	}

	static int RangSum(int start, int end) {
		if(start==0) return preProcessing[end];
		return preProcessing[end] - preProcessing[start-1];
	}
}
