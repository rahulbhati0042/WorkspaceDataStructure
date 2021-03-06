package com.arrayproblems;

import java.util.ArrayList;
import java.util.List;

public class ArrayLeftSmallerRightGreater {

	public static void main(String[] args) {
		// int[] arr = {5, 1, 4, 3, 6, 8, 10, 7, 9};
		 //int[] arr =  {10, 6, 3, 1, 5, 11, 6 ,1, 11 ,12};
		// int[] arr =  {5, 6, 4, 1, 7, 12, 9, 1, 4, 1 ,11, 5, 7 ,1};
		 int[] arr =  { 6, 1, 10};
		int leftMax[]=new int[arr.length];
		
		leftMax[0]=Integer.MIN_VALUE;
		List<Integer> list=new ArrayList<>();
		for(int i=1; i<arr.length;i++){
			leftMax[i]=Math.max(leftMax[i-1], arr[i-1]);
		}
		int rightMin = Integer.MAX_VALUE;
		
		for(int i=arr.length-1; i>=0;i--){
			if(leftMax[i]<=arr[i] && rightMin>= arr[i]){
				System.out.println("Index :"+i+ " Value :"+arr[i]);
				list.add(arr[i]);
			}
			 rightMin = Math.min(rightMin,arr[i]);	
		}
		System.out.println(list);
		if(list.size()>1)
		System.out.println(list.get(list.size()-1));
	}

}
