package com.company;

import java.util.Scanner;

public class print_AllPermutations {
    // print all permutations of a string iteratively
    // input ----> string ----> abc
    // output ----> string ---->  abc,acb,bac,bca,cab.cba



    public static void print_Permutations(String str){
        int n = str.length();
        int f = Factorial(n);


        for(int i=0;i<f;i++){
             StringBuilder sb = new StringBuilder(str);
            int temp = i;
            for(int div=n;div>=1;div--){
                int q = temp/div;
                int rem = temp%div;

                System.out.print(sb.charAt(rem));
                sb.deleteCharAt(rem);

                temp = q;

            }
            System.out.println();
        }
    }



    // find factorial

    public static int Factorial(int n){
        int value = 1;
        for(int i=2;i<=n;i++){
            value *= i;
        }
        return value;
    }





    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String str = sc.next();
         print_Permutations(str);


    }
}
