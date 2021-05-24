package com.recursion.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class mazePathWithJumps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<String > paths = getMazePaths(1,1,n,m);
        System.out.println(paths);
    }

    public static ArrayList<String> getMazePaths(int sr,int sc,int dr,int dc){

        // base case

        if(sr == dr && sc == dc){

            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return  bres;
        }




        ArrayList<String> resultPath = new ArrayList<>();
          // horizontal move
        for(int moveSize=1;moveSize<=dc-sc;moveSize ++){
            ArrayList<String> hpaths = getMazePaths(sr,sc + moveSize,dr,dc);

            for(String path: hpaths){
                resultPath.add("h" + moveSize + path);

            }
        }

        // vertical move

        for(int moveSize=1;moveSize <= dr-sr;moveSize ++){
            ArrayList<String> vPaths = getMazePaths(sr + moveSize,sc,dr,dc);

            for(String path : vPaths){

                resultPath.add("v" + moveSize + path);
            }
        }


        // diagonal move

        for(int moveSize=1; moveSize <= dr-sr && moveSize <= dc-sc;moveSize ++){
            ArrayList<String> dpaths = getMazePaths(sr + moveSize, sc + moveSize,dr,dc);

            for(String path : dpaths){

                resultPath.add("d" + moveSize + path);
            }
        }


        return resultPath;
    }
}
