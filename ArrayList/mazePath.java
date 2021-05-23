package com.recursion.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class mazePath {

    // Question -----> maze path problem
    // find no. of path for going to source row,source column to destination row,destination column in a maze that is two Dimensional matrix
   // we have to move either horizontal by 1 step or vertical by 1 step
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<String> path = getMazePath(1,1,n,m);
        System.out.println(path);



    }

    // sr = source row
    // sc = source column
    // dr destination row
    // dc = destimation column

    public static ArrayList<String> getMazePath(int sr,int sc,int dr,int dc){
        // base case

        if(sr == dr && sc == dc){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }


        ArrayList<String> horizontalPath = new ArrayList<>();
        ArrayList<String> verticalPath = new ArrayList<>();

        if(sc<dc){
            horizontalPath = getMazePath(sr,sc+1,dr,dc);    // horizonatal move

        }
        if(sr<dr){
            verticalPath = getMazePath(sr+1,sc,dr,dc);      // vertical move
        }

        ArrayList<String> paths = new ArrayList<>();

        for( String hpath: horizontalPath){
            paths.add("h" + hpath);
        }

        for(String vpath : verticalPath){
            paths.add("v" + vpath);
        }

        return paths;



    }
}
