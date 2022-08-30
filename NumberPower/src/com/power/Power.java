package com.power;

public class Power {
	// x^y
	public static void main(String[] args) {

		int x = 5;
		int y = 10;
		int j = 1;
		while (y > 0) {
			j = j * x;
			y--;
		}
		System.out.println(j);

	}

}
