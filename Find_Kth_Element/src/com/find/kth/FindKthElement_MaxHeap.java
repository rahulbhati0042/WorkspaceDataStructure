package com.find.kth;

public class FindKthElement_MaxHeap {
	static int arr[] = { 62, 37, 49, 39, 33, 63, 91, 5, 17, 84 };
   //5,17,33,37,39,49,62,63,84,91
	public static void main(String[] args) {
		int kth = 4;
		convertMaxHeap(kth);
		int result = findKthElement(kth);
		System.out.println("Kth Smallest :" + result);
	}

	private static void convertMaxHeap(int kth) {
		int y = 1;
		int ci = 0, ri = 0;
		while (y < kth) {
			ci = y;
			while (ci > 0) {
				ri = (ci - 1) / 2;
				if (arr[ci] > arr[ri]) {
					int g = arr[ci];
					arr[ci] = arr[ri];
					arr[ri] = g;

					ci = ri;
				} else {
					break;
				}
			}
			y++;
		}
	}
	private static int findKthElement(int kth) {
		int e = kth;
		while (e < arr.length) {
			if (arr[0] > arr[e]) {
				arr[0] = arr[e];
				convertMaxHeap(kth);
			}
			e++;
		}
		return arr[0];

	}

}
