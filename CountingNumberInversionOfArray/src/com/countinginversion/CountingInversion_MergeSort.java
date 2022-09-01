package com.countinginversion;


public class CountingInversion_MergeSort {
	public static void main(String[] args) {
		//int arr[] = {1000,900,800,700,600,500,400,300,200,100};
		int arr[] = { 6,4,12,3,32,76,54,19,27,62 };
		int result = invCount(arr,arr.length);
		System.out.println("Inventory Count :"+result);
	}
	
	private static int invCount(int arr[], int size){
		
		int tmp[] = new int[size];
		int count;
		count = mergeSort(arr,0,size-1,tmp);
		
		return count;
	}

	private static int mergeSort(int[] arr, int lb, int ub, int[] tmp) {
		int mid;
		int count =0;
		if(lb<ub){
			mid = (lb+ub)/2;
			
			count = count + mergeSort(arr, lb, mid, tmp);
			count = count + mergeSort(arr,  mid+1,ub, tmp);
			count = count + merge(arr, lb, mid,ub, tmp);
		}
		return count;
	}

	private static int merge(int[] arr, int lb, int mid, int ub, int[] tmp) {
		int i1,i2,i3,count=0;
		i1 = lb;i2 =mid+1;
		i3 = lb;
		while(i1<=mid && i2<=ub){
			if(arr[i1]<arr[i2]){
				tmp[i3]= arr[i1];
				i1++;
			}else{
				tmp[i3]= arr[i2];
				count = count + (mid-i1)+1;
				i2++;
			}
			i3++;
		}
		while(i1<=mid){
			tmp[i3]=arr[i1];
			i1++;
			i3++;
		}
		while(i2<=ub){
			tmp[i3]=arr[i2];
			i2++;
			i3++;
		}
		i3=lb;
		while(i3<=ub){
			arr[i3]= tmp[i3];
			i3++;
		}
		return count;
	}
	
}
