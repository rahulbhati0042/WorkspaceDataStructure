package com.smallestdistancebetweentwopoints;

public class SmallestdistacneBetweenTwoPoint_SecondWay {
	/**
	 * 1.Sort array by x-axis(Already sorted from x-axis)
	 * 2.divide array by 2 3.find smallest from left side
	 * 4.find smallest from right side. 5.find smallest from left & right
	 * smallest distance.
	 * 
	 * @param args
	 */
	static int x1, x2, y1, y2;
	static int a1 = 0, a2 = 0, b1 = 0, b2 = 0;
	public static void main(String[] args) {

		int arr[][] = { { 1, 3 }, { 1, 6 }, { 2, 3 }, { 2, 7 }, { 2, 8 },
				{ 3, 5 }, { 3, 9 }, { 4, 8 }, { 4, 10 }, { 5, 7 }, { 5, 10 },
				{ 6, 6 }, { 6, 9 }, { 7, 4 }, { 7, 10 }, { 8, 3 }, { 8, 6 },
				{ 9, 4 }, { 10, 7 }, { 10, 10 }, { 11, 9 }, { 11, 11 } };
		int mid = arr.length/2;
		int xAxisArray[][]=new int[mid][2];
		int YAxisArray[][]=new int[mid][2];
		
		int e=0;
		while(e<mid){
			xAxisArray[e]=arr[e];
			e++;
		}
	
		int f= 0;
		while(mid<=e && e<arr.length){
			YAxisArray[f]=arr[e];
			e++;
			f++;
		}

		
		
		///Find smallest from x-axis
		double xAxisDist= smallestDist(xAxisArray,0);
		int sideA_x1=a1;
		int sideA_y1=b1;
		int sideA_x2=a2;
		int sideA_y2=b2;
		double yAxisDist=smallestDist(YAxisArray,1);
		int sideB_x1=a1;
		int sideB_y1=b1;
		int sideB_x2=a2;
		int sideB_y2=b2;
		System.out.println("Smallest points distance X-axis :"+xAxisDist);
		System.out.println("Smallest points distance Y-axis :"+yAxisDist);
		
		double result = Math.min(xAxisDist, yAxisDist);
		System.out.println("Smallest Distance :"+result);
		
	}

	public static double smallestDist(int axisArr[][], int axis){
		double smallestDis = Integer.MAX_VALUE;
		 int e = 0; int f = 0;
		
		while (e < axisArr.length) {
			x1 = axisArr[e][0];
			y1 = axisArr[e][1];
			f = e + 1;
			while (f < axisArr.length) {
				x2 = axisArr[f][0];
				y2 = axisArr[f][1];

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
		if(axis==0) System.out.println("===X-Axis Smallest Points===");
		else System.out.println("===Y-Axis Smallest Points===");
		System.out.println("Smallest Distance :" + smallestDis);
		System.out.println("(" + a1 + "," + b1 + ") And (" + a2 + "," + b2
				+ ")");
		System.out.println("===================================");
		return smallestDis;
	}
	
}
