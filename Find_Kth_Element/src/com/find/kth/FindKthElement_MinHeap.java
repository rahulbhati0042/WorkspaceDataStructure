package com.find.kth;


public class FindKthElement_MinHeap {
	static int arr[] = { 62, 5, 91, 54, 32, 79, 37, 63, 51, 49 };	
	public static void main(String[] args) {

		getMinHeap();
		int result = findKthElement(4);
		System.out.println("Kth Smallest :" + result);
	}

	private static void getMinHeap() {
		int y = 1;
		int ci = 0, ri = 0;
		int tmp = 0;
		while (y < arr.length) {

			ci = y;
			while (ci > 0) {
				ri = (ci - 1) / 2;
				if (arr[ci] < arr[ri]) {
					tmp = arr[ci];
					arr[ci] = arr[ri];
					arr[ri] = tmp;
				}
				ci = ri;
			}
			y++;
		}

	}
		private static int findKthElement(int kth) {
		int y = arr.length - 1;
		int ri = 0, lci = 0, rci = 0, swi = 0;
		int e = kth - 1;
		while (y > 0 && e > 0) {
			int g = arr[y];
			arr[y] = arr[0];
			arr[0] = g;
			y--; // array from 0 to 8
			ri = 0;
			while (ri < y) {
				lci = (ri * 2) + 1;
				if (lci > y)
					break;
				rci = lci + 1;

				if (rci > y) {
					swi = lci;

				} else {
					if (arr[lci] < arr[rci]) {
						swi = lci;
					} else {
						swi = rci;
					}
				}
				if (arr[swi] < arr[ri]) {
					int tmp = arr[swi];
					arr[swi] = arr[ri];
					arr[ri] = tmp;
					ri = swi;
				} else {
					break;
				}
			}
			e--;
		}

		return arr[0];

	}

}
