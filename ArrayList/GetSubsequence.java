package com.recursion.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class GetSubSequence {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        ArrayList<String> result = getSubSequence(str);
        System.out.println(result);

    }

    public static ArrayList<String> getSubSequence(String str){

        // find subsequence of abc


        // base case

        if(str.length() == 0){
            ArrayList<String> baseResult = new ArrayList();
            baseResult.add("");
            return baseResult;
        }
        // faith bc -> [--,-c,b-,bc]
        // expectation abc -> [---,a--,--c,a-c,-b-,ab-,-bc,abc]

        char ch = str.charAt(0); // a
        String restOfString = str.substring(1); // bc
        ArrayList<String> recursionResult = getSubSequence(restOfString);  // [--,-c,b-,bc]

        ArrayList<String> myResult = new ArrayList<>();

        for(String resultString : recursionResult){
            myResult.add("" + resultString);
        }

        for(String resultString : recursionResult){
            myResult.add(ch + resultString);
        }
        return myResult;

    }

}
