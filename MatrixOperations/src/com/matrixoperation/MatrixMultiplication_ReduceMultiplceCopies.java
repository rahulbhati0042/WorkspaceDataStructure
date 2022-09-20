package com.matrixoperation;

public class MatrixMultiplication_ReduceMultiplceCopies {

	public static void main(String[] args) {
		int A[][] = new int[8][8];
		int B[][] = new int[8][8];
		
		int i=0;
		while(i<8){
			int j =0;
			while(j<8){
				A[i][j] = i+1+j;
				B[i][j] = i+2+j;
				j++;
			}
			i++;
		}
		

		int C[][] = new int[A.length][B.length];

		int num = 0, e = 0, f = 0, g = 0;

	}

}
