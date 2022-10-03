package com.palindrome;

public class SubString {
public static void main(String[] args) {
	char str[]  = {'a','b','c','d','e','f'};
	int len = str.length;
	int e,f,g;
	for(e=0;e<len;e++){
		for(f=e;f<len;f++){
			for(g=e;g<=f;g++){
				System.out.print(str[g]);
			}
			System.out.println();
		}
	}
}
}
