package com.generics;

class Gener<T>{
    // class is parameterised class
    // T is placeholder for actual type

    T ob;   // ob is reference variable of type T

    // constructor

    Gener(T o){
        ob = o;   // copying reference of o to ob;
    }

    // method and return type will be T

    T getOb(){
        return ob;
    }

}


public class Generic {

    public static void main(String[] args) {
        // creating an object of Gener class


        // here passing Integer means type argument
        Gener<Integer> intObject = new Gener<>(88);  // here autoboxing occur i.e int to Integer
        int value = intObject.getOb();// here unboxing occur  Integer to int and here no need for typecasting
        System.out.println(value);

        Gener<String> StrObject = new Gener<>("Generic-code"); // autoboxing ----> string to String
        String str = StrObject.getOb();   // String to str ----> unboxing
        System.out.println(str);


        // here it solves the problem of object type
        // it show error during compile time
//
//        intObject= StrObject;
//        value = intObject.getOb();
//        System.out.println(value);



        // checking for double value

        Gener<Double> doubleObject = new Gener<>(8.8);
        double dobValue = doubleObject.getOb();
        System.out.println(dobValue);
    }
}
