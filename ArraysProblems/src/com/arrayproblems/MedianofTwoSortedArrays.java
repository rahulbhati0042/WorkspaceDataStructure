package com.arrayproblems;

import java.util.Arrays;

public class MedianofTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums1[] ={1,3};
		int nums2[] ={2};
		double median = findMedianSortedArrays(nums1, nums2);
		System.out.println(median);
	}
	   public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
	        int nums3[]= new int[nums1.length+nums2.length];
	        int k=0;
	        for(int i=0; i<nums1.length; i++){
	            nums3[k]=nums1[i];
	            k=k+1;
	        } for(int i=0; i<nums2.length; i++){
	            nums3[k]=nums2[i];
	            k=k+1;
	        }
	        Arrays.sort(nums3);
	       int size = nums3.length;
	        // check for even case
	        if (size % 2 != 0)
	            return (double)nums3[size / 2];
	        
	        int midIndex = size/2;
	        return (double)(nums3[midIndex] + nums3[midIndex-1]) / 2.0;
	        
	    }
}
