package com.generics;

// Question
// create a generic class that contain a method that print the type that is passed as Number(Integer,Float,Double)

class Gen<T extends Number>{
    T a;
    // constructor
    Gen(T a){
        this.a = a;
    }

    void printType(){
        System.out.println(a.getClass().getName());
    }
}

public class BoundedType_Generics {
    public static void main(String[] args) {
        Gen<Integer> gen =  new Gen<>(56);
        gen.printType();

        // for double

        Gen<Double> gen1 = new Gen<>(5.8);
        gen1.printType();
    }

}
