package com.arrayproblems;

import java.util.ArrayList;
import java.util.List;

public class SpirallyTraversing_a_Matrix {

	public static void main(String[] args) {
		int arr[][] = {{1,2,3,4},
					   {5,6,7,8},
					   {9,10,11,12},
					   {13,14,15,16}};
		
		int top =0, bottom = arr.length-1;
		int left = 0, right = arr[0].length-1;
		int direction =0;
		int i=0;
		
		List<Integer> spiralFormList = new ArrayList<Integer>();
		
		while(top <=bottom && left <=right){
			
			if(direction==0){
				for(i=left; i<= right ;i++){
					spiralFormList.add(arr[top][i]);
				}
				top++;
			}else if(direction==1){
				for(i=top ; i<=bottom;i++){
					spiralFormList.add(arr[i][right]);
				}
				right--;
			}else if(direction==2){
				for(i=right;i>=left;i--){
					spiralFormList.add(arr[bottom][i]);
				}
				bottom--;
			}else if(direction==3){
				for(i=bottom;i>=top;i--){
					spiralFormList.add(arr[i][left]);
				}
				left++;
			}
			direction = (direction+1)%4;
			
		}
		System.out.println(spiralFormList);

	}

}
