package com.champuser;
import java.util.Scanner;

public class BinarySearch {



    public static int BinarySearch_Iterative(int arr[], int low, int high, int data) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if ( arr[mid] == data )
                return mid;
            else if ( arr[mid] > data )
                high = mid - 1;
            else low = mid + 1;

        }



       return -1;
    }

    public static int BinarySearch_Recursive(int []arr,int low,int high,int data){
        // base condition
        if(low>high)
            return -1;
        int mid = low + (high - low)/2;
        if(arr[mid] == data)
            return mid;
        else if(arr[mid]>data)
            return BinarySearch_Recursive(arr,low,mid-1,data);
        return BinarySearch_Recursive(arr,mid+1,high,data);

    }
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int data = sc.nextInt();
        int dataIndex = BinarySearch_Recursive(arr, 0, n - 1, data);
        System.out.println(dataIndex);

    }
}
