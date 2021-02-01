package com.company;

// Implementation of stack using linkedList


class ListNode{
    int data;
    ListNode next;
    ListNode(int data){   // constructor
        this.data = data;
        this.next = null;
    }
}
public class StackLinkedList {
    ListNode head = null;
    void push(int data){
        ListNode newNode = new ListNode(data);
        if(head == null)
            head = newNode;
        newNode.next = head;
        head = newNode;
    }

    int pop(){
        if(head == null){
            System.out.println("Stack is Empty");
            return -1;

        }
        int data = head.data;
        head = head.next;
        return data;
    }

}
