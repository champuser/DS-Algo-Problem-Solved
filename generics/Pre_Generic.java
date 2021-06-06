package com.generics;

// pre-generic code


class NonGen1{

    Object ob; // ob is referring to object class

    // constructor

    NonGen1(Object o){
        ob = o;        // copy the reference from one object to another
    }

    Object getOb(){
        return ob;
    }



}
public class Pre_Generic {

    public static void main(String[] args) {
        // create NonGen object and store Integer in it

        NonGen1 intObj =  new NonGen1(88);
        int value = (Integer) intObj.getOb();       // typecasting
        System.out.println(value);

        // create NonGen object for string type

        NonGen1 strObject = new NonGen1("pre-generics code");
        String strValue =  (String) strObject.getOb ();
        System.out.println(strValue);

        // this will give runtime error
        intObj = strObject;
        value = (Integer) intObj.getOb();
        System.out.println(value);



    }

}
