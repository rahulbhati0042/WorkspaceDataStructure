package com.knapsack;

import java.util.HashMap;
import java.util.Map;

//Pending
public class KnapshakBounded_Tabular_Approach_Second {
	static int numberOfCopies=0;
	public static void main(String[] args) {
		int weightArray[] = {1, 5, 10, 15, 20, 22 };
		int valueArray[] = { 5, 2, 6, 4, 5, 3 };
		int size = weightArray.length-1;
		int capacity = 25;
		Map<Integer, Map<Integer, Integer>> map = new HashMap<Integer, Map<Integer,Integer>>();
		Map<Integer, Integer> child = new HashMap<Integer, Integer>();
		child.put(0, 0);
		map.put(0, child);
		
		for(int e =0;e<weightArray.length;e++){
			int v = valueArray[e];
			int w = weightArray[e];
			
			Map<Integer, Integer> pre=map.get(e);
			for (Map.Entry<Integer, Integer> entry : pre.entrySet()) {
				int va = entry.getKey()+valueArray[e];
				int wa = entry.getValue()+weightArray[e];
				child.put(va, wa);
			}
			Map<Integer, Integer> merge=map.get(e);
			for (Map.Entry<Integer, Integer> entry : merge.entrySet()) {
				int va = entry.getKey()+valueArray[e];
				int wa = entry.getValue()+weightArray[e];
				child.put(va, wa);
			}
			
			
		}
		
	}

	
}
