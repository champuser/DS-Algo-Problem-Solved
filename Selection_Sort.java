package com.company;

public class selectionSort {

    public static void selection_Sort(int arr[]){
        // it select the minimum element & keep this at the first place

         int n = arr.length;
         int min,i,temp;
         for( i=0;i<n-1;i++){
             min  = i;             // let assume
             for(int j=i+1;j<n;j++){
                 if(arr[j] < arr[min])
                     min = j;
             }

             // swap with the 1st element
             temp  = arr[min];
             arr[min] = arr[i];
             arr[i] = temp;


         }

    }


    // printing the array
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        selectionSort ss = new selectionSort();
        int arr[] = {8,3,5,7,2,9,6};
        ss.selection_Sort(arr);
        ss.printArray(arr);

    }
}
