package com.palindrome;

import java.util.Arrays;

public class Palindrome_SubString_DynamicProgramming {
	public static void main(String[] args) {
		char str[] = { 'a', 'c', 'c', 'a', 'c', 'c' };
		int len = str.length;
		int sp = 0, ep = 0;
		int e = 0;
		int f = 0;
		char[][] store = new char[len][len];
		sp = len - 1;

		while (ep < len) {
			//when length is 0
			if (ep == 0) {
				sp = len - 1;
				while (sp > 0) {
					f = sp;
					e = ep;
					while (f < len) {
						store[f][e] = 'F';
						f++;
						e++;
					}
					sp--;
				}
				// same length 00,11,22,33,44,55
				e = ep;
				f = sp;
				while (e < len) {
					store[f][e] = 'T';
					e++;
					f++;
				}
				//when length is 1
			} else if (ep - sp == 1) {
				e = ep;
				f = sp;
				while (e < len) {
					if (str[e] == str[f])
						store[f][e] = 'T';
					else
						store[f][e] = 'F';
					e++;
					f++;
				}
				//when length is >=2
			} else {
				e = ep;
				f = sp;
				while (e < len) {
					if (str[e] == str[f])
						store[f][e] = store[f + 1][e - 1];
					else
						store[f][e] = 'F';
					e++;
					f++;
				}
			}
		ep++;
		}
///////////////////////
		for (int k = 0; k < store.length; k++)
			System.out.println(Arrays.toString(store[k]));
		
		e=0;
		f=0;
		while(e<len){
			f=e;
			String data="";
			while(f<len){
				data = data+""+str[f];
				if(store[e][f]=='T'){
					System.out.println("Length :" + data.length()
							+ " , isPalindrome :" + data);
					
				}
				f++;
			}
			e++;
		}

	}
}