package com.arrayproblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Triplets_3Sum_LeetCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]={-1,0,1,2,-1,-4};
		   int n = nums.length;
	        List<List<Integer>> list = new ArrayList<List<Integer>>();
	        
	        for(int i=0; i<n; i++){
	            
	            for(int j=i+1; j<n; j++){
	                
	                for(int k=j+1; k<n; k++){
	                    
	                    int sum = nums[i]+nums[j]+nums[k];
	                    if(sum == 0 ){
	                        List<Integer> tmpList = new ArrayList<Integer>();
	                        tmpList.add(nums[i]);
	                        tmpList.add(nums[j]);
	                        tmpList.add(nums[k]);
	                        Collections.sort(tmpList);
	                        if(!list.contains(tmpList)){
	                        	list.add(tmpList);
	                        }
	                    }
	                    
	                }
	            }
	        }
	        System.out.println(list);
	}

}