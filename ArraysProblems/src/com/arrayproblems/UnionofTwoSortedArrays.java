package com.arrayproblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class UnionofTwoSortedArrays {

	public static void main(String[] args) {
		int n = 5, arr1[] = {1, 2, 3, 4, 5}  ;
		int m = 3, arr2 [] = {1, 2, 3};
		 HashSet<Integer> hs=new HashSet<>();
         
         for(int x:arr1){
             hs.add(x);
         }
         for(int y:arr2){
             hs.add(y);
         }
          ArrayList<Integer> al = new ArrayList<>(hs);
          Collections.sort(al);
          System.out.println(al);
	}

}
