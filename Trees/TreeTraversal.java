package com.Trees;

public class TreeTraversal {

    Node root;  // this is reference variable for type class Node;

    TreeTraversal(){
        root= null;


    }

    void preOrderTraversal(Node node){
       if(node == null)
           return;
        System.out.println(node.data);
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
   }



}








