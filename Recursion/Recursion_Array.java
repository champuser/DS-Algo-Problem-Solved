/**
**/


package com.Recursion;

import java.util.Scanner;

public class Recursion_Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
//        displayArray(arr,0);
        displayArrayReverse(arr,0);
    }
    public static void displayArray(int[] arr,int index){
        if(index == arr.length){
            return;
        }
      System.out.println(arr[index]);
        displayArray(arr,index+1);


    }

    // display Array reverse
    public static void displayArrayReverse(int[] arr,int index){
        // base case
        if(index== arr.length){
            return;
        }
        displayArrayReverse(arr,index + 1);
        System.out.println(arr[index]);
    }
}
