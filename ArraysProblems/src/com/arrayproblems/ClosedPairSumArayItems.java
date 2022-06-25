package com.arrayproblems;

public class ClosedPairSumArayItems {

	public static void main(String[] args) {
		int arr[] = { 10, 22, 28, 29, 30, 40, 41 };
		int x = 54;
		int diff = Integer.MAX_VALUE;
		int pre_low=0;
		int pre_high =0;
		int low=0;
		int high= arr.length-1;
		while(low<high)
		{
			int sum = arr[low]+arr[high];
			if(diff> Math.abs(sum-x)){
				diff= Math.abs(sum-x);
				pre_low= low;
				pre_high= high;
			}
			if(sum>x) high--;
			else low++;
		}
		System.out.println("Closed Pairs "+arr[pre_low]+" & "+arr[pre_high]);
		
	}

}
