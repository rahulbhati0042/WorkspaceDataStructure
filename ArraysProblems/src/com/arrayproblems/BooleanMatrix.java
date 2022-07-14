package com.arrayproblems;

public class BooleanMatrix {

	public static void main(String[] args) {
		int a[][] = { { 0, 1, 0 }, { 1, 0, 0 }, { 1, 0, 0 }, { 0, 0, 0 } };
		int R = a.length, C = a[0].length;
		int row[] = new int[R];
		int col[] = new int[C];
		for (int i = 0; i < R; i++) {
			row[i] = 0;
		}
		for (int i = 0; i < C; i++) {
			col[i] = 0;
		}
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				if (a[i][j] == 1) {
					row[i] = 1;
					col[j] = 1;
				}
			}
		}
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				if (row[i] == 1 || col[j] == 1) {
					a[i][j] = 1;
				}
			}
		}
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}

	}

}
