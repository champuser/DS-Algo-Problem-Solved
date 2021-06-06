package com.generics;

class NonGen{
    int a,b;
    double c,d;
    // constructor
    NonGen(int a , int b){
        this.a =a;
        this.b = b;
    }

    int getMax(){
        return Math.max(a,b);
    }

    // constructor for double value

    NonGen(double a,double b){
        c=a;
        d=b;
    }
    double getDoubleMax(){
        return Math.max(c,d);
    }





}

public class Main {

    public static void main(String[] args) {
	// write your code here

        // reference variable
        NonGen ng = new NonGen(8,10);
        System.out.println(ng.getMax());


        // get max for double value

        NonGen ng1 = new NonGen(5.6,6.6);
        System.out.println(ng1.getDoubleMax());

    }
}
