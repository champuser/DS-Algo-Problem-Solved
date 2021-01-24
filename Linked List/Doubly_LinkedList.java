

package com.dlllinkedlists;


class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){                    // this constructor is called when the new DLL get created
        this.data = data;
        this.next = null;
        this.prev = null;
    }

}



public class DoublyLinkedList {
    Node head = null;

    void insertAtBeg(int data){
        Node newNode = new Node(data);
        if(head ==  null){
            head =  newNode;
            return;                       // return here for the returning the method
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;

    }


    void insertAtEnd(int data){
        Node tempNode = head;
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;

        }
        while (tempNode.next!= null)
            tempNode = tempNode.next;
        tempNode.next = newNode;
        newNode.prev = tempNode;

    }
       // Printing the list
    void printList(){
        Node tempNode = head;
        while(tempNode!= null){
            System.out.print(tempNode.data);
            System.out.println();
            tempNode = tempNode.next;
        }
        System.out.println("List is Printed ");

    }




}
