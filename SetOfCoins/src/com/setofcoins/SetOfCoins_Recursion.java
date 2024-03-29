package com.setofcoins;

public class SetOfCoins_Recursion {
	static int voc[] = { 5, 10 };
	static int vocCount = voc.length;
	static int copiesCount = 0;
	static int n = 10;

	public static void main(String[] args) {

		int result = getMinCoins(n);
		System.out.println("Minimum number of coins require are " + result
				+ " to get " + n);
		System.out.println("Copies Created :" + copiesCount);
	}

	private static int getMinCoins(int value) {

		int noc = Integer.MAX_VALUE - 1, k, e;
		copiesCount++;
		if (value == 0)
			return 0;
		
		for (e = 0; e < vocCount; e++) {
			if (voc[e] <= value) {

				k = getMinCoins(value - voc[e]);
				if (k + 1 < noc)
					noc = k + 1;
			}
		}

		return noc;
	}
}
