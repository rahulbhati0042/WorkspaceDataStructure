package com.arrayproblems;

import java.util.ArrayList;

public class ArrayReverseGroup {

	public static void main(String[] args) {
		// int a[] = { 1, 2, 3, 4, 5 };
		ArrayList<Integer> a = new ArrayList<>();
		// 87 21 48 56 35
		a.add(87);
		a.add(21);
		a.add(48);
		a.add(56);
		a.add(35);
		int k = 3;
		for (int i = 0; i < a.size(); i += k) {
			int left = i;
			int right = Math.min(i + k - 1, a.size() - 1);
			int temp;
			while (left < right) {
				temp = a.get(left);
				a.set(left, a.get(right));
				a.set(right, temp);

				left++;
				right--;
			}
		}
		System.out.println(a);
	}

}
