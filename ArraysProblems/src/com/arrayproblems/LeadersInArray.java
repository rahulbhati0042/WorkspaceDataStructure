package com.arrayproblems;

public class LeadersInArray {

	public static void main(String[] args) {
		int arr[] = { 16, 17,17, 4, 3, 5, 2 };
		//int arr[] = {31,40,93,4,4, 98};
		for (int i = 0; i < arr.length; i++) {
			int j;
			for (j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j])
					break;
			}
			if (j == arr.length)
				System.out.println(arr[i]);
		}

	}

}
