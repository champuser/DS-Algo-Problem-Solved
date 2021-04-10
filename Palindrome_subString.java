package com.company;

import java.util.Scanner;

public class Palindrome_subString {
    public static boolean isPalindrome(String s){
        int i=0;
        int j=s.length() -1;

        while(i<=j){
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);
            if(ch1 != ch2)
            {
                return false;
            }else{
                i++;
                j--;
            }
        }
        return true;
    }

    public static void allSub_String(String str){
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                String s = str.substring(i,j);
                if(isPalindrome(s) == true){
                    System.out.println(s);
                }

            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        allSub_String(str);



    }
}
