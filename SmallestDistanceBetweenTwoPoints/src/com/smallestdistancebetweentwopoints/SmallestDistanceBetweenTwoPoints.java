package com.smallestdistancebetweentwopoints;

public class SmallestDistanceBetweenTwoPoints {

	public static void main(String[] args) {
		int arr[][] = { { 1, 11 }, { 1, 13 }, { 2, 10 }, { 2, 12 }, { 3, 10 },
				{ 3, 12 }, { 3, 13 }, { 5, 6 }, { 6, 13 } };

		double smallestDis = Integer.MAX_VALUE;
		int e = 0, f = 0;
		int x1, x2, y1, y2;
		int a1 = 0, a2 = 0, b1 = 0, b2 = 0;
		while (e < arr.length) {

			x1 = arr[e][0];
			y1 = arr[e][1];
			f = e + 1;
			while (f < arr.length) {
				x2 = arr[f][0];
				y2 = arr[f][1];

				double dist = Math.pow(Math.sqrt(x2 - x1) + Math.sqrt(y2 - y1),
						2);
				if (smallestDis > dist) {
					smallestDis = dist;
					a1 = x1;
					a2 = x2;
					b1 = y1;
					b2 = y2;
				}
				f++;
			}
			e++;
		}
		System.out.println("Smallest Distance :" + smallestDis);
		System.out.println("(" + a1 + "," + b1 + ") And (" + a2 + "," + b2
				+ ")");

	}

}
