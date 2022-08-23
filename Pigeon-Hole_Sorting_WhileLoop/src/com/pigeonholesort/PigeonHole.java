package com.pigeonholesort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class PigeonHole {

	public static void main(String[] args) {
		int arr[] = {5,67,6,5,4,3,2,33,4,555,67,8,0};
		int max =0,min=arr[0],e=0;
		while(e<arr.length){
			max  = Math.max(max, arr[e]);
			min = Math.min(min, arr[e]);
			e++;
		}
		int rang = (max-min)+1;
		LinkedList<List<Integer>> tmp = new LinkedList<>();
		e=0;
		while(e<rang){
			tmp.add(e,null);
			e++;
		}
		e=0;
		int index=0;
		while(e<arr.length){
			 index = arr[e]-min;
			List<Integer> elements = new ArrayList<>();
			 if(tmp.get(index)==null){
				elements.add(arr[e]);
				 tmp.add(index, elements);
			}else{
				elements  = tmp.get(index);
				elements.add(arr[e]); 
				 tmp.set(index, elements);
			 }
			
			e++;
		}
		int f=0;
		e = 0;
		while(e<tmp.size()){
			
			if(tmp.get(e)!=null){
				int c =0;
				while(c<tmp.get(e).size()){
					arr[f] = tmp.get(e).get(c);
					f++;
					c++;
				}
			}
			e++;
		}
		System.out.println(Arrays.toString(arr));
	}

}
