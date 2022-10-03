package com.setofcoins;

import java.util.Arrays;

public class CoinsProblem_TabaularForm_DynamicProgramming {
	static int voc[] = { 0, 2, 3, 5 };
	static int value = 10; // 10rupes banana he

	static int table[][] = new int[voc.length][value + 1];
	static int minimumCoins = Integer.MAX_VALUE;
	static int e = 0;
	static int intMax = Integer.MAX_VALUE - 1;
	public static void main(String[] args) {
		table[0][0] = 0;
		int column = 1;
		while (e < table[0].length) {
			table[0][e] = intMax;
			e++;
		}
		int row = 1;
		column = 1;
		while (row < table.length) {
			while (column < table[0].length) {
				if (column < voc[row]) {
					table[row][column] = table[row - 1][column];
				} else {
					int previousRowIndVal = table[row][column - voc[row]] + 1;
					int previousColIndVal = table[row - 1][column];
					table[row][column] = Math.min(previousRowIndVal,
							previousColIndVal);
				}
				column++;
			}
			minimumCoins = Math.min(minimumCoins, table[row][column-1]);
			row++;
			column = 1;
}
		for (int e = 0; e < table.length; e++)
			System.out.println(Arrays.toString(table[e]));
		System.out.println("Minimum number of coins require are " + minimumCoins
				+ " to get " + value);
	}
}