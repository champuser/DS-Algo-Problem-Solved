package com.recursion.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class StairPath {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<String> paths = getStairPaths(n);
        System.out.println(paths);

    }


    public static ArrayList<String> getStairPaths(int n){
        // base case

        if(n == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }else if(n<0){
            // if - ve then simply return bres
            ArrayList<String> bres = new ArrayList<>();
            return bres;
        }



       // faith -----> 3 calls
        ArrayList<String> path1 = getStairPaths(n-1);
        ArrayList<String> path2 = getStairPaths(n-2);
        ArrayList<String> path3 = getStairPaths(n-3);

        ArrayList<String> paths = new ArrayList<>();

        for(String path : path1){
            paths.add(1 + path);
        }

        for(String path: path2){
            paths.add(2 + path);
        }

        for(String path: path3){
            paths.add(3 + path);
        }

        return paths;
    }
}
