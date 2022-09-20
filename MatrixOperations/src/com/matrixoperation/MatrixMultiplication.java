package com.matrixoperation;

import java.util.Arrays;

public class MatrixMultiplication {

	public static void main(String[] args) {
		int A[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 },
				{ 13, 14, 15, 16 } };
		int B[][] = { { 10, 20, 30, 40 }, { 50, 60, 70, 80 },
				{ 90, 100, 110, 120 }, { 130, 140, 150, 160 } };

		int C[][] = new int[A.length][B.length];

		int num = 0, e = 0, f = 0, g = 0;
		while (e < A.length) {
			f = 0;
			while (f < B.length) {

				g = 0;
				num=0;
				while (g < B.length) {
					num = num + (A[e][g] * B[g][f]);
					g++;
				}
				C[e][f] = num;
				f++;
			}
			e++;
		}
		for (int i = 0; i < C.length; i++) {
			System.out.println(Arrays.toString(C[i]));
		}

	}

}
