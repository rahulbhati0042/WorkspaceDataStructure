package com.smallestdistancebetweentwopoints;

public class SmallestdistacneBTTwoPoint_Second_Recursive {
	/**
	 * 1.Sort array by x-axis(Already sorted from x-axis) 2.divide array by 2
	 * 3.find smallest from left side 4.find smallest from right side. 5.find
	 * smallest from left & right smallest distance.
	 * 
	 * @param args
	 */
	static int arr[][] = { { 1, 3 }, { 1, 6 }, { 2, 3 }, { 2, 7 }, { 2, 8 },
			{ 3, 5 }, { 3, 9 }, { 4, 8 }, { 4, 10 }, { 5, 7 }, { 5, 10 },
			{ 6, 6 }, { 6, 9 }, { 7, 4 }, { 7, 10 }, { 8, 3 }, { 8, 6 },
			{ 9, 4 }, { 10, 7 }, { 10, 10 }, { 11, 9 }, { 11, 11 } };
	static int e = 0;
	static int f = 0;
	static int x1, x2, y1, y2;
	public static void main(String[] args) {

		int mid = arr.length / 2;
		
	}

	public void recursive(int pointA[],int pointB[],int mid){
		int x1, x2, y1, y2;
		x1 = pointA[0];
		y1 = pointA[1];
		x2 = pointB[0];
		y2 = pointB[1];
	 //Pending
	}
	
	
}
