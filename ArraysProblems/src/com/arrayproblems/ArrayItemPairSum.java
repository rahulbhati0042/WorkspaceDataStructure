package com.arrayproblems;

public class ArrayItemPairSum {

	public static void main(String[] args) {
	 int a[]={11,15,6,8,9,11};
	 int x=26;
	 for(int i=0;i<a.length-1;i++){
		 for(int j=i+1;j<a.length;j++){
			 if(a[i]+a[j]==x){
				 System.out.println(a[i]+" + "+a[j]+" = "+x);
			 }
		 }
	 }

	}

}
