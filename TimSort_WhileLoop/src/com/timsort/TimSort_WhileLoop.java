package com.timsort;

import java.util.Arrays;

public class TimSort_WhileLoop {

	public static void main(String[] args) {
		int arr[] = { 9, 6, 5, 6, 7, 3, 8, 77, 6, 44, 8, 33, 11, 44, 11, 22,
				44, 88, 55, 2 };
		int segment = 5;
		int numerOfCycle = arr.length / segment;
		int e = 0;
		int y = 0, num = 0, z = 0;
		int c = 0 , d=0;;
		while (e < numerOfCycle) {
			int segmentArr[] = new int[segment];
			int itemIndex = 0;
			while (itemIndex < segment) {
				segmentArr[itemIndex] = arr[c];
				c++;
				itemIndex++;
			}
			System.out.println("Before segment insertion sort");
			System.out.println(Arrays.toString(segmentArr));
			y = 1;
			while (y < segmentArr.length) {
				num = segmentArr[y];
				z = y - 1;
				while (z >= 0 && segmentArr[z] > num) {
					segmentArr[z + 1] = segmentArr[z];
					z--;
				}
				segmentArr[z + 1] = num;
				y++;
			}
			System.out.println("After segment insertion sort");
			System.out.println(Arrays.toString(segmentArr));
			
			itemIndex =0;
			while (itemIndex < segment) {
				arr[d]=segmentArr[itemIndex];
				d++;
				itemIndex++;
			}
			e++;
		}
		System.out.println("===========segments");
		System.out.println(Arrays.toString(arr));
		e = 0;
		int slb1=0,sub1=0,slb2=0,sub2=0;
		while(numerOfCycle>1){
			
			int lb1= slb1;
			int ub1 = slb1+segment-1;
			int lb2 = ub1+1;
			int ub2 = lb2+segment;
			int tmpArr[] = new int[ub2];
			int i1 = lb1;
			int i2 = lb2;
			int lb3=0, ub3 = tmpArr.length;
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
			while(i3<ub2 && c< arr.length){
				arr[c] = tmpArr[i3];
				i3++;
				c++;
			}
			slb1 =ub2;
			//============Note completed
			System.out.println("ok ");
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	

}
