package com.company;
import java.util.Scanner;

public class KConsecutive_MaxSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int arr[] =  new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            int sum =0,max=0;
            for(int i=0;i<k;i++){
                sum += arr[i];
            }
            max= sum;
            for(int i = k;i<n;i++){
                sum = sum + arr[i] - arr[i-k];

                if(sum>max){
                    max= sum;
                }
            }
            System.out.println(max);

        }
    }

}
