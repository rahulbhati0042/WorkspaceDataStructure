package com.palindrome;

public class Palindrome_WhileLoop {
	public static void main(String[] args) {
		String str = "malayalam";
		System.out.println("Is "+str+" Is Palindrome :"+palindrome(str));
	}
	public static boolean palindrome(String str){
		
		int lb = 0;
		int ub = str.length()-1;
		while(lb<=ub){
			if(str.charAt(lb)!=str.charAt(ub))
				return false;
			lb++;
			ub--;
		}
		return true;
	}
}
