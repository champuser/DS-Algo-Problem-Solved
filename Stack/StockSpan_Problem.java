package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class StockSpanProblem {
    
    
    // BruteForce Approach using Array

    static void calculateSpan(int price[],int n,int spanValue[]){
        spanValue[0]=1; // span value of first day is 1
        //
        for(int i=1;i<n;i++){
            spanValue[i]=1;   // initialize span value
            //checking & comparing with the left
            // traverse left while the next element on the left is smaller than price[i]
            for(int j= i-1;(j>=0) && (price[i]>=price[j]);j--){
                spanValue[i]++;
            }
        }

    }
    static void printArray(int arr[]){

        // return the array as string
        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {
//        int price[] = {10,20,30,5,7,10};
//        int n = price.length;
//        int spanValue[] = new int[n];
//        calculateSpan(price,n,spanValue);
//        printArray(spanValue);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StockSpanProblem span = new StockSpanProblem();
        int price[] = new int[n];
        for(int i=0;i<n;i++){
            price[i]= sc.nextInt();
        }
        int spanValue[]= new int[n];
        calculateSpan(price,n,spanValue);
        printArray(spanValue);



    }
}
