package com.Recursion;

import java.util.Scanner;

public class Recursion_Question {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
        int n = sc.nextInt();

//        printDecreasing(n);
//        printIncreasing(n);
//        printDecreasingIncreasing(n);
//        int fact  = Factorial(n);
//        System.out.println(fact);
//
//        int power = powerLogarithmic(x,n);
//        System.out.println(power);
        printZigZag(n);


    }

    // 1. print Decreasing

    public static void printDecreasing(int n){
        // base case
        if (n<= 0)
            return;
        System.out.println(n);
        printDecreasing(n -1);


    }
    // 2. print increasing
    public static void printIncreasing(int n){
        // base case
        if(n==0)
            return;
        printIncreasing(n-1);
        System.out.println(n);

    }
    // for given n print increasing decreasing
    public static  void printDecreasingIncreasing(int n){
        if( n == 0)
            return;
        System.out.println(n);
        printDecreasingIncreasing(n-1);
        System.out.println(n);

    }
    // factorial


    public static int Factorial(int n){
        if(n == 1)
            return 1;
        int fact = Factorial(n-1);
         fact = n * fact;
         return fact;

    }
    // power linear

    public static  int powerLinear(int x, int n){
        //  base case  i.e x^n
        if(n==0)
            return 1;
        int power = powerLinear(x,n-1);
        power = x * power;
        return  power;


    }

    // power logarithmic i.e reducing the complexity   i.e logn

    public static int powerLogarithmic(int x,int n){
        if(n == 0)
            return 1;
        int power = powerLogarithmic(x,n/2);
        power = power *power;   // if the n is even
        // if n is odd
        if(n % 2 == 1){
            power = x * power;
        }
        return power;

    }

    // print zig-zag pattern where two recursive call occur
    // input= 2,output= 211121112
    // input = 3, output= 321112111232111211123
    public static  void printZigZag(int n){
        if( n == 0){
            return;
        }
        System.out.println(n); // pre
        printZigZag(n-1);   // left
        System.out.println(n);  // In
        printZigZag(n-1);   // right
        System.out.println(n);  // post
    }


}
