package com.Trees;

import com.sun.source.tree.Tree;

public class Main {

    public static void main(String[] args) {
	// write your code here

        TreeTraversal tree = new TreeTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right =  new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);


        System.out.println("PreOrderTraversal is:");
        tree.preOrderTraversal(tree.root);

    }
}
