package com.company;
import java.io.*;
import java.util.*;

public class string_Compression {
    public static String Compression1(String str){
        // input ----->  aaabbcccddaeef
        String s = str.charAt(0) + "";   // giving 0th index to string

        for(int i=1;i<str.length();i++){
            char current = str.charAt(i);
            char previous = str.charAt(i-1);
            if(current != previous){
                s += current;

            }
        }


     return s;

    }

    public static String Compression2(String str){

        // input ----> aaabbcddd
        //output ----> a3b2cd3
        String s = str.substring(0,1);
          int count =1;
          for(int i=1;i<str.length();i++){
              char current = str.charAt(i);
              char previous = str.charAt(i-1);
              if(current == previous){
                  count ++;
              }else{
                  if(count>1){
                      s += count;
                      count =1;
                  }
                  s += current;
              }
          }



      // last element
        if(count >1){
            s += count;
            count =1;
        }


        return s;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(Compression1(str));
        System.out.println(Compression2(str));
    }
}
