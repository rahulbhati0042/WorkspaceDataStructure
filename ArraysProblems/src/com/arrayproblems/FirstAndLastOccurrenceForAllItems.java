package com.arrayproblems;

public class FirstAndLastOccurrenceForAllItems {
	public static void main(String[] args) {
		int arr[]= {2,3,4,5,5,6,7,7,7,7,9,11};
		int l = 0;
		int r = arr.length - 1;
		int first = l, last = l;
		int i = 1;
		while (l <= r) {

			if ((arr.length-1 > l+i) && arr[l] == arr[l + i] ) {
				first = l;
				last = l + i;
				i++;
			} else {
				System.out.println("Firsst Ocurrence of :" + arr[l] + " is :" + first);
				System.out.println("Last Ocurrence of :" + arr[l] + " is :" + last);
				System.out.println("========================");

				 l = l+i;
				i = 1;
				first = l; last = l;
			}
			
		}
	}
}
