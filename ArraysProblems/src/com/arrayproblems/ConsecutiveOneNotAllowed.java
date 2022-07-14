package com.arrayproblems;

public class ConsecutiveOneNotAllowed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		long zeroend = 1; // for 0
		long oneend = 1; // for 1
		long sum = zeroend + oneend;
		if (n == 1) {
			System.out.println("sum :" + sum);
		}
		int i = 2;
		while (i <= n) {
			oneend = zeroend % (1000000007);
			zeroend = sum % (1000000007);
			sum = zeroend + oneend % (1000000007);
			i++;
		}
		System.out.println(sum % (1000000007));
	}
}
