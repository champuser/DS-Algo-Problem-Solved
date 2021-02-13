package com.Hashing;
import java.util.HashMap;
import java.util.Scanner;

public class SameSet_Element {

    public static void main(String[] args) {
	// write your code here

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n= sc.nextInt();
            int arr[] = new int[n];
            int brr[] = new int[n];
            for (int i=0;i<n;i++)
                arr[i] = sc.nextInt();
            for (int i=0;i<n;i++)
                brr[i] = sc.nextInt();

            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i=0;i<n;i++){
                if(map.get(arr[i]) == null)
                    map.put(arr[i],1);
                else{
                    map.put(arr[i],map.get(arr[i])+1);
                }

            }
            boolean flag = true;
            for(int i=0;i<n;i++){
                // if there is an element in array2 but not in arrar1
                if(!map.containsKey(brr[i])){
                    flag = false;
                    break;
                }
                // if an element of array 2 appears more times than it appears in array1
                if(map.get(brr[i]) == 0){
                    flag = false;
                    break;

                }
                map.put( brr[i],map.get(brr[i]-1));
            }
            if (flag){
                System.out.println("Both arrays have same set of numbers");}
            else {
                System.out.println("Both arrays have different set of numbers");
            }
        }
    }
}
