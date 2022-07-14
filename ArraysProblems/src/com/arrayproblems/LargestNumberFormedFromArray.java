package com.arrayproblems;



public class LargestNumberFormedFromArray {

	public static void main(String[] args) {
		int arr[]={3,30,34,9};
		String largestNumber="";
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				String ij= arr[i]+""+arr[j];
				String ji= arr[j]+""+arr[i];
				if((Long.parseLong(ji))>Integer.parseInt(ij)){
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++){
			largestNumber = largestNumber+""+arr[i];
		}
		System.out.println(largestNumber);
		
	}

}
