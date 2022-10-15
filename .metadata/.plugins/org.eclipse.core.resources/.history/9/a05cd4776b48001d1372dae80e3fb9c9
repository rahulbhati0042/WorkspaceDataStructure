package com.array.problems;

public class FindArrayValidMountain {
	public static void main(String[] args) {
		FindArrayValidMountain a = new FindArrayValidMountain();
		System.out.println("Is valide mountain :" + a.isValidMountain());

	}

	boolean isValidMountain() {
		int arr[] = { 0, 3, 4, 5, 6, 3, 1 };
		int l = 0;
		int r = arr.length - 1;
		while (l < r && arr[l] < arr[l + 1]) {
			l = l + 1;
		}
		if (l == 0 || l == r) {
			System.out.println("Not valid mountain");
			return false;
		}
		while (l < r && arr[l] > arr[l + 1]) {
			l = l + 1;
		}
		if (l == r) {
			return true;
		} else {
			return false;
		}

	}
}
