package com.arrayproblems;

public class FindMissingAndRepeatingNumber {

	public static void main(String[] args) {
		int arr[] = { 4, 3, 6, 2, 4, 1 };

		boolean check = false;
		int count = 0;
		for (int i = 1; i <= arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == arr[j]) {
					check = true;
					count++;
					if (count > 1){
						System.out.println("Repeating :" + i);
					}
				}
			}
			if (!check)
				System.out.println("Missing :" + i);
			check = false;
			count=0;
		}

	}

}
