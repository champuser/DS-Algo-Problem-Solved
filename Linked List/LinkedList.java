
Inserting an element at begining,mid & end of a Linked List & print the list


package com.linkedlistds;
class Node{
    int data;
    Node next;                     // object variable
    Node(int data){               // cunstructor for putting data into node
        this.data = data;
        this.next = null;

    }

}

public class LinkedList {
    Node head = null;
    void insertAtBeg(int data){
        Node newNode = new Node(data);      // creating new  Node object
        newNode.next = head;       // next of newNode pointing to head
        head = newNode;             // now head is updated to newNode
    }

    void insertAtMid(int num,int data){
        Node tempNode = head;
        while(tempNode!= null && tempNode.data!=num)
            tempNode = tempNode.next;

          // if tempNode.data = num then break the loop & create new Node
             Node newNode = new Node(data);
             newNode.next = tempNode.next;      // next of new node will point to next of tempNode i.e node value of 3 so that not loose the reference of node value 2 & 3
             tempNode.next = newNode;
    }
    void insertAtEnd(int data){
        Node newNode = new Node(data);   // new node with data is created somewhere on memory

        if(head == null){
            head =   newNode;
        }else{
            Node tempNode = head; // tempNode object variable bcs if we traverse the list then we loose the reference of next node
            while(tempNode.next !=  null){      // go to last node i.e next of last node is null
                tempNode = tempNode.next;

                // to avoiding the null pointer exception we have  to chaeck wheter my list is empty or not

            }
            tempNode.next = newNode;

        }


    }


    // Printing the list

    void printList(){
        Node tempNode = head;
        while (tempNode!=null){
            System.out.print(tempNode.data);
            System.out.println();
            tempNode = tempNode.next;


        }
    }


}
