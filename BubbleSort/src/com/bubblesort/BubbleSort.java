package com.bubblesort;
import java.util.Arrays;
public class BubbleSort {

    public static void main(String[] args) {
        int[] intArray = { 2, 35, -15, 7, 55, 1, -22 };

           for (int i=1;i<intArray.length;i++){

               int temp=intArray[i];
               int j;
               for(j=i; j>0 && intArray[j-1]>temp ;j--){
                    intArray[j]= intArray[j-1];
               }
               intArray[j]=temp;
           }
   System.out.println("Insertion Sorted Array :"+ Arrays.toString(intArray));
    }

}

