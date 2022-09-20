package com.subarray;

import java.util.Arrays;

public class PrintAllPossibleSubSequence_Non_ContiguousForm {

	public static void main(String[] args) {

		char[] arr = { 'a', 'b', 'c', 'd' };
		int powerArray[] = new int[arr.length];
		int e = arr.length-1;
		int on = 0, off = 0;
		int ff=0;
		while (e >= 0) {
			int f = e;
			int power = 1;
			while (f != 0) {
				power = power * 2;
				--f;
			}
			powerArray[ff] = power;
			on = on + power;
			e--;
			ff++;
		}
		System.out.println(Arrays.toString(powerArray));
		e = 0;
		int arryTmp[][] = new int[on][arr.length];
		while (e < on) {
			int lb = powerArray[0];
			int ub = powerArray[powerArray.length-1];
			
			
			if(e==0){
				int k=0;
				while(k<arr.length){
					arryTmp[e][k]=0;
					k++;
				}
				
			}
			while(lb>ub){
				int k=0;
				while(k<arr.length){
					
					arryTmp[e][k]=0;
					
					k++;
				}
			}
			e++;
			System.out.println("ok");
		}

	}

}
