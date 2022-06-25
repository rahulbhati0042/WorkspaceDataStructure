package com.arrayproblems;

public class ArrayLeftSmallerRightGreater {

	public static void main(String[] args) {
		int arr[] = {4, 2, 5, 7};
		
		for(int i=0;i<arr.length;i++){
			 int item = arr[i];
			 
			 for(int j=0;j<arr.length;j++){
				 
				 if(j< i && arr[j] < item){
					 break;
				 }else if(i< j && arr[j]> item){
					 break;
				 }
				 
				 
			 }
		}

	}

}
