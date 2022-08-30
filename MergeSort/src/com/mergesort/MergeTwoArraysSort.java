package com.mergesort;

import java.util.Arrays;

public class MergeTwoArraysSort {

	public static void main(String[] args) {
		int arr[]={5, 6, 6, 7, 9,3, 6, 8, 44, 77};
		int tmpArr[] = new int[10];
		int lb1=0, ub1=4;
		int lb2 = 5, ub2 = arr.length;
		int lb3=0, ub3 = arr.length;
		int i1 = lb1;
		int i2 = lb2;
		int i3 = lb3;
		while(i1<ub1 && i2<ub2){
			if(arr[i1]<arr[i2]){
				tmpArr[i3] = arr[i1];
				i1++;
			}else{
				tmpArr[i3]= arr[i2];
				i2++;
			}
			i3++;
		}	
			while(i1<=ub1){
				tmpArr[i3] = arr[i1];
				i3++;
				i1++;
			}
			while(i2<ub2){
				tmpArr[i3] = arr[i2];
				i3++;
				i2++;
			}
		i3 = lb1;
		while(i3<ub2){
			arr[i3] = tmpArr[i3];
			i3++;
		}
		System.out.println(Arrays.toString(arr));
	}

}
