package com.palindrome;

public class Palindrom_Main {
	public static void main(String[] args) {
		String str = "malayalam";
		Data data = isPalindrome(str);
		System.out.println("Length :" + data.length + " , isPalindrome :"
				+ data.palindrome);
	}

	public static Data isPalindrome(String str) {
		Data data = new Data();
		data.length = str.length();
		char q[] = new char[str.length()];

		int j = 0;
		for (int i = str.length() - 1; i >= 0; i--, j++)
			q[j] = str.charAt(i);
		data.palindrome=1;
		for (int i = 0; i < str.length(); i++){
			if(q[i]!=str.charAt(i)){
				data.palindrome = 0;
				break;
			}
			
		}

		return data;
	}

	static class Data {
		int length;
		int palindrome;
	}
}
