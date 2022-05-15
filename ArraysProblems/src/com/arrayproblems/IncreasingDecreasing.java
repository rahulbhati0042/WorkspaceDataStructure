package com.arrayproblems;

public class IncreasingDecreasing {

	public static void main(String[] args) {
		//int arr[] = {1,2,3,4,5,3,2,1};
		int arr[] = {3,2,1,2,3,4,5};
		//int arr[] = {1,2,3,4,5,6,7,8};
		//int arr[] = { 8, 7, 6, 5, 4, 3, 2, 1 };
		int flag_in = 0;
		int flag_de = 0;
		boolean flag_in_de = false;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] < arr[i + 1]) {
				flag_in++;
				if (i == 0)
					flag_in_de = true;
			} else if (arr[i] > arr[i + 1]) {
				flag_de++;
				if (i == 0)
					flag_in_de = false;
			}
		}
		if (flag_in > 0 && flag_de == 0) {
			System.out.println("Only Increasing");
		} else if (flag_de > 0 && flag_in == 0) {
			System.out.println("Only Decreasing");
		} else if (flag_in_de) {
			System.out.println("Increasing then Decreasing");
		} else if (!flag_in_de) {
			System.out.println("Decreasing then Increasing  ");
		}
		//Using Without loop
		checkType(arr, arr.length);
	}
	//without loop
	  public static void checkType(int arr[], int n)
	    {
		  if (arr[0] <= arr[1] &&
	            arr[n - 2] <= arr[n - 1])
	            System.out.println("Increasing");
		  else if (arr[0] >= arr[1] &&
	                 arr[n - 2] >= arr[n - 1])
	            System.out.println("Decreasing");
	       else if (arr[0] <= arr[1] &&
	                 arr[n - 2] >= arr[n - 1])
	            System.out.println("Increasing then decreasing");
	       else
	            System.out.println("Decreasing then increasing");
	    }
}
