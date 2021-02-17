package com.Recursion;
import java.util.Scanner;

public class TowerOfHanoi {

    public static void main(String[] args) {
	// write your code here
        Scanner  sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int t1 = sc.nextInt();
        int t2 = sc.nextInt();
        int t3 = sc.nextInt();
        TOH(n,t1,t2,t3);
    }
    public static void TOH(int n, int Tower1,int Tower2, int Tower3){
        // Here Tower1= Source tower, Tower2 = Destination tower, Tower3 = Helper Tower
        
        // Question is to print the instructions
        

        // base case
        if(n == 0){
            return;
        }
        TOH(n-1,Tower1,Tower3,Tower2);
        // will print the instructions to move n-1 disks from Tower1 to Tower3 using Tower2
        System.out.println(n + "  [ " + Tower1 + " -> " + Tower2 + " ]");    
        TOH(n-1,Tower3,Tower2,Tower1);

    }
}
