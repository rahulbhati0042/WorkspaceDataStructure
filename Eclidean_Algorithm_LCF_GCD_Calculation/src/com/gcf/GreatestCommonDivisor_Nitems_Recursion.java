package com.gcf;


//Not completed
public class GreatestCommonDivisor_Nitems_Recursion {
	static int arr[] = { 14, 21, 42, 49, 77 };
	static int hcf = 0;
	static int e = 1, f = 0;

	public static void main(String[] args) {

		mainRecursion(e, f);
		System.out.println(hcf);
	}

	private static void mainRecursion(int e2, int f2) {
		if(e2==arr[0]){
			return;
		}
		
		e2=e2+1;
		f2=0;
		recursion(e2, f2);
	}

	
	public static void recursion(int e, int f) {
		if (arr[f] % e != 0) {
			return;
		}
		hcf = e;
		recursion(e, f+1);
		
	}
}