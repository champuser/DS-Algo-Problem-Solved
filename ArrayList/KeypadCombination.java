package com.recursion.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class KeypadCombination {
    public static void main(String[] args) {


        // get all the combination of words that can be made after passing the string where the given string is number and number stands for a key on a mobile number

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> words = getKpc(str);
        System.out.println(words);


    }


    // decalare global string array to store character as for mobile

    static String[] codes = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static ArrayList<String> getKpc(String str){

        // base case

        if(str.length() == 0){
            ArrayList<String> baseResult = new ArrayList<>();
            baseResult.add("");
            return baseResult;
        }

        // 78   -----> 6 words
        // 678  ----> 24 words

        char ch = str.charAt(0);    // 6
        String restOfString = str.substring(1);  // 78

        ArrayList<String > recursionResult = getKpc(restOfString);
        ArrayList<String> myResult = new ArrayList<>();

        String codeForCh = codes[ch - '0'];

        for(int i=0;i<codeForCh.length();i++){

            char resultChar = codeForCh.charAt(i);
            for(String rstr : recursionResult){
                myResult.add(resultChar + rstr);
            }
        }
        return myResult;





    }

}
