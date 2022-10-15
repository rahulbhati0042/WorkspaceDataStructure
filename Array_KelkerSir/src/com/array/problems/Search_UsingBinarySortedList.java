package com.array.problems;

public class Search_UsingBinarySortedList {

	public static void main(String[] args) {
		int x[] = { 5, 8, 40, 50, 60, 70, 80, 90, 100 };
		int lb = 0;
		int ub =x.length;
		int mid =(lb + ub) /2;
		int target = 50;
		while(lb <= ub){
			mid  = (lb+ub)/2;
			if(x[mid] == target){
				System.out.println(target+" elements in the array at index :"+mid);
				break;
			}
			else if(x[mid] >  target){
				ub = mid-1;
			}else{
				lb = mid+1;
			}
		}
	}

}
