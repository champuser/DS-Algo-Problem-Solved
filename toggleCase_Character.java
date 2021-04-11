package com.company;

import java.util.Scanner;

public class toggleCase {

    public static String ToggleCase_Character(String str){
        // input ---> PREPbytEs
        // output ----> prepBYTeS

        StringBuilder sb = new StringBuilder(str);
        for(int i=0;i<sb.length();i++){
            char ch = sb.charAt(i);
            if(ch >= 'a' && ch<= 'z'){
                char upperCase_char = (char)('A' + ch - 'a');
                sb.setCharAt(i,upperCase_char);


            }else if(ch >= 'A' && ch <= 'Z'){
                char lowerCase_char = (char) + ('a' + ch - 'A');
                sb.setCharAt(i,lowerCase_char);

            }
        }
      return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(ToggleCase_Character(str));

    }
}
