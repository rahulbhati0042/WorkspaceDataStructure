package com.arrayproblems;

public class ArrayEquilibriumPoint {

	public static void main(String[] args) {
		//int a[] = {-7, 1, 5, 2, -4, 3, 0};
		int a[] = {1,3,5,2,2}; 
		int leftSum=0;
		int rightSum=0;
		int equilibriumPoint = 0;
		for(int i =0;i<a.length;i++){
			leftSum=0;
			for(int j=0;j<i;j++){
				leftSum = leftSum+a[j];
			}
			rightSum=0;
			for(int j =i+1 ; j<a.length ; j++){
				rightSum = rightSum+a[j];
			}
			
			if(leftSum==rightSum) {
				equilibriumPoint = i;
				break;
			}
			
		}
		System.out.println(equilibriumPoint);
	}

}
