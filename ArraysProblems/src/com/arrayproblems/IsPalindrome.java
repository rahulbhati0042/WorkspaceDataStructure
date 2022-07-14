package com.arrayproblems;

public class IsPalindrome {

	public static void main(String[] args) {
		int arr[] =  {111, 222, 333, 444, 555};
		int value =palinArray(arr, arr.length);
		System.out.println(value);
	}
	public static int palinArray(int[] a, int n)
    {
        int isPalin=0;
           for(int i=0; i<n; i++){
               int number = a[i];
               int reverse = 0;  
                  while(number != 0)   
                     {  
                     int remainder = number % 10;  
                     reverse = reverse * 10 + remainder;  
                     number = number/10;  
                     }
                 if(reverse == a[i]) {
                     isPalin=1;
                 }else{
                     isPalin=0;
                     break;
                 }
           }
           return isPalin;
    }
}
