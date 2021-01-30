package com.linkedlistds;

import java.io.IOException;
import java.util.Scanner;


public class Floyd_Cycle_Detection {
       static class SinglyLinkedListNode{
           int data;
           SinglyLinkedListNode  next;
           SinglyLinkedListNode(int nodeData){
               this.data = nodeData;
               this.next = null;

        }
    }
    static class SinglyLinkedList{
           SinglyLinkedListNode head;
           SinglyLinkedListNode tail;

           SinglyLinkedList(){
               this.head = null;
               this.tail = null;
           }
        void insert(int nodeData){
            SinglyLinkedListNode  node =  new SinglyLinkedListNode(nodeData);
            if(this.head == null){
                this.head = node;
            }else{
                this.tail.next = node;
            }
            this.tail = node;
        }
    }

    static void printLinkedList(SinglyLinkedListNode head){
           SinglyLinkedListNode temp = head;
            while(temp != null){
                System.out.println(temp.data + "  ");
                temp =  temp.next;
            }
        System.out.println();
    }

    private static boolean findCycle(SinglyLinkedListNode head){
           // taking two pointers
        SinglyLinkedListNode slow = head,fast= head;
        while(slow!= null && fast!= null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            return true;
        }
        return false;

    }

    private static final Scanner scanner = new Scanner(System.in);



    public static void main(String[] args) throws IOException {
      SinglyLinkedList llist = new SinglyLinkedList();
      int listCount  = scanner.nextInt();
      for(int i =0;i<listCount;i++){
          int listItem = scanner.nextInt();
          llist.insert(listItem);
      }

      // creating an artificial cycle in the linkedList
      llist.head.next.next.next.next = llist.head.next.next.next;
      boolean res = findCycle(llist.head);
      if(res)
          System.out.println("Cycle Found");
      else
          System.out.println("Cycle not Found");



    }
}
