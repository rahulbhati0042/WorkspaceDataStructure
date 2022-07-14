package com.arrayproblems;

import java.util.HashSet;
import java.util.Set;

public class SmallestPositiveMissingNumber_Method2_Hashset {

	public static void main(String[] args) {
	int arr[] = {0,-10,1,3,-20};
	int missing =1;
	Set<Integer> set=new HashSet<>();
	
	for(int i=0;i<arr.length;i++){
		set.add(arr[i]);
	}
	for(int i=1;i<=arr.length;i++){
		if(!set.contains(i)){
			missing=i;
			break;
		}
	}
	System.out.println("Missing :"+missing);

	}

}
