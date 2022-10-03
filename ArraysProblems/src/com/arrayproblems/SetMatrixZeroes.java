package com.arrayproblems;

import java.util.Arrays;

public class SetMatrixZeroes {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 1, 1,0 }, { 1, 0, 1 ,1}, { 1, 1, 1,1 } };
		int tmpMatrix[][] = new int[matrix.length][matrix[0].length];
		for(int i=0; i<matrix.length; i++)
			  for(int j=0; j<matrix[i].length; j++)
				  tmpMatrix[i][j]=matrix[i][j];
		

		int e = 0;
		int f = 0;
		while (e < tmpMatrix.length) {
			f = 0;
			while (f < tmpMatrix[e].length) {
				if (tmpMatrix[e][f] == 0) {
					int t = 0;
					while (t < tmpMatrix[e].length) {
						matrix[e][t] = 0;
						t++;
					}
					t = 0;
					while (t < tmpMatrix.length) {
						matrix[t][f] = 0;
						t++;
					}

				}
				f++;
			}
			e++;
		}

		System.out.println(Arrays.toString(matrix));
		 e=0;
		while (e < matrix.length) {
			f = 0;
			while (f < matrix[e].length) {
				System.out.print(matrix[e][f]+" ");
				f++;
			}
			System.out.println();
			e++;
		}
	}

}