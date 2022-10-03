package com.arrayproblems;

public class FindKthLargest {
	public static void main(String[] args) {
		int a[] = {99,99};
		int kth = 1;
		int result = findKthLargest1(a, kth);
		System.out.println(result);
	}
	 public static int findKthLargest1(int[] nums, int k) {
	        int e =0;
	        int target = nums.length-k;
	        int n = nums.length;
	        int max=0;
	        while(e<n){
	            if(max<nums[e]) max = nums[e];
	            e++;
	        }
	        int tmp[] =new int[max+1];
	        e=0;
	         while(e<n){
	           tmp[nums[e]]= tmp[nums[e]]+1;
	             e++;
	         }
	        int count=0;
	        e=tmp.length-1;
	        while(e>0){
	            if(tmp[e]>0) {
	                count=count+tmp[e];
	            }
	            if(count==k){
	                return e;
	            }
	            e--;
	        }
	        return tmp.length-1;
	    }   
	public static int findKthLargest(int[] nums, int k) {
		boolean swpHappend = true;
		int e = 0;
		int target = nums.length - k;
		int tmp = 0;
		while (swpHappend) {
			swpHappend = false;
			e = 0;
			while (e < target) {
				if (nums[e] > nums[target]) {
					tmp = nums[e];
					nums[e] = nums[target];
					nums[target] = tmp;
					swpHappend = true;
				}
				e++;
			}
			e = nums.length - 1;
			while (e > target) {
				if (nums[e] < nums[target]) {
					tmp = nums[e];
					nums[e] = nums[target];
					nums[target] = tmp;
					swpHappend = true;
				}
				e--;
			}
		}
		return nums[target];
	}
}