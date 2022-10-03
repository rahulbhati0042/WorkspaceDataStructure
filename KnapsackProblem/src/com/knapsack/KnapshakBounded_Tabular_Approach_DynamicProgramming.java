package com.knapsack;

import java.util.Arrays;

public class KnapshakBounded_Tabular_Approach_DynamicProgramming {
	static int numberOfCopies=0;
	public static void main(String[] args) {
		int weightArray[] = {0, 1, 5, 10, 15, 20, 22 };
		int valueArray[] = { 0,5, 2, 6, 4, 5, 3 };
		int size = weightArray.length-1;
		int capacity = 25;
		int store[][] = new int[size+1 ][capacity+1 ];
		int maxSS = 0;
		for (int e = 1; e <=size; e++) {
			
			for (int f = 1; f < capacity+1; f++) {
				if(e==1 ){
					if(f>=weightArray[e]){
						store[e][f]=valueArray[e];
					}
				}else if(f<weightArray[e]){
					store[e][f] = store[e-1][f];
				}else{
					int v = store[e-1][f-weightArray[e]]+valueArray[e];
					store[e][f] = Math.max(v,  store[e-1][f]);
				}
				maxSS = Math.max(maxSS, store[e][f]);
			}
		}
		System.out.println("Max value that can be taken away in the knapsack with capacity 25 is "+maxSS);
		for (int e = 0; e < store.length; e++)
			System.out.println(Arrays.toString(store[e]));
	}	
}
