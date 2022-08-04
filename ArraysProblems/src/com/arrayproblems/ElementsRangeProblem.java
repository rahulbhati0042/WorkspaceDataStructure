package com.arrayproblems;

public class ElementsRangeProblem {

	public static void main(String[] args) {
		int arr[] =  {1, 4, 5, 2, 7, 8, 3};
		int A=2, B=5;
		int n= arr.length;
		 boolean check=false;
	        for(int i=A; i<=B; i++){
	            check = false;
	            for(int j=0; j<n; j++){
	                if(i == arr[j]) {
	                    check = true;
	                 }
	            }
	            if(!check){
	                System.out.println("No");
	            }
	        }
	        System.out.println(check);

	}

}
