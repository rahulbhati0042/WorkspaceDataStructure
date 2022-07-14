package com.arrayproblems;

import java.util.ArrayList;

public class ArrayDuplicateUsingCountVar {

	public static void main(String[] args) {
		// int arr[] = { 4, 2, 4, 5, 2, 3, 1 };
		int arr[] = { 13, 9, 25, 1, 1, 0, 22, 13, 13, 13, 22, 20, 3, 8, 11, 25,
				10, 3, 15, 11, 19, 20, 2, 4, 25, 14, 23, 14 };
		int arr_size = arr.length;
		int count[] = new int[arr_size];
		int i;
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("Repeated elements are : ");
		for (i = 0; i < arr_size; i++) {
			if (count[arr[i]] == 1) {
				list.add(arr[i]);
				count[arr[i]]++;
				System.out.print(arr[i] + " ");
			} else
				count[arr[i]]++;
		}
		System.out.println(list);
	}

}
