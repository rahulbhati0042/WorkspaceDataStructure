package com.fibonacci.series;

public class ParticularNumFibonacciSeriousNum_Recursion {
	static int x = 0;
	static int y = 1;
	static int z = 0;

	public static void main(String[] args) {
		int result = fibonacci(10);
		System.out.println("10th febonacci serious number is :"+result);
		
		
		
	}

	public static int fibonacci(int k) {
		if (k <= 1)
			return k;
		return fibonacci(k-1)+fibonacci(k-2);
	}
}
