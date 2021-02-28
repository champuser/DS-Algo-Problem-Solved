package com.company;
import java.util.Scanner;

public class findElement {

    public static void main(String[] args) {
	// write your code here
        // find element
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();;
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        // find the data
        // initially the index
        int index = -1;
        int data = sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]== data){
                index = i;
                break;

            }
        }
        System.out.println(index);
    }
}
