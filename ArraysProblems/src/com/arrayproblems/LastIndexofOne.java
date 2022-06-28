package com.arrayproblems;

public class LastIndexofOne {

	public static void main(String[] args) {
		String s = "0001";
		int lastIndex=-1;
		for(int i=0;i< s.length();i++){
			if(s.charAt(i)=='1'){
				lastIndex=i;
			}
		}
		System.out.println(lastIndex);

	}

}
