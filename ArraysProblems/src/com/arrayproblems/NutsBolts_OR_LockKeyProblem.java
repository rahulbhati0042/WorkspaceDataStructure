package com.arrayproblems;

import java.util.Arrays;

public class NutsBolts_OR_LockKeyProblem {

	public static void main(String[] args) {
		// Nuts and bolts are represented as array of characters
        char nuts[] = {'@', '#', '$', '%', '^', '&'};
        char bolts[] = {'$', '%', '&', '^', '@', '#'};
        
        String str = "!#$%&*@^~";
        int p=0;
        for(int i=0;i<str.length(); i++){
            for(int j=0; j<nuts.length; j++){
                if(nuts[j]==str.charAt(i)){
                    char tmp = nuts[j];
                    nuts[j]= nuts[p];
                    nuts[p]= tmp;
                    bolts[p]=nuts[p];
                    p++;
                }
                if(p>nuts.length-1) break;
            }
        }
        System.out.println("Nuts :"+Arrays.toString(nuts));
        System.out.println("Bolts :"+Arrays.toString(bolts));
	}
	

}
