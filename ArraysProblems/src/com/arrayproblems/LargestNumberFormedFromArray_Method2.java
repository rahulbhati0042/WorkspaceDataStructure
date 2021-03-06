package com.arrayproblems;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumberFormedFromArray_Method2 {

	public static void main(String[] args) {

		String str[] = { "3", "30", "34", "9" };
		Arrays.sort(str, new Comparator<String>() {

			public int compare(String a, String b) {
				String o1 = a + b;
				String o2 = b + a;
				return o2.compareTo(o1);
			}

		});
		StringBuilder s = new StringBuilder();
		for (String a : str) {
			s.append(a);
		}
		System.out.println( s);

	}

}
