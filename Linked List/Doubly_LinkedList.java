

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
            return;
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



    // Insert a node in  between the node

    void insertInBetween(int num,int data){
        Node tempNode = head;
        Node  newNode = new Node(data);
        if(head== null){
            head = newNode;
            return;
        }
        while(tempNode.data != num)
            tempNode = tempNode.next;


        newNode.next = tempNode.next;

        if(newNode.next != null)       // for avoiding i.e the newnode of next will not be null i.e newnode should not be last element
        newNode.next.prev = newNode;  // prev of rightmost node i.e connected to newNOde
        tempNode.next = newNode;
        newNode.prev = tempNode;



    }


    // deleting the node


    void delete(int num){
        Node delNode = head;
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        while(delNode!= null && delNode.data!= num)
            delNode = delNode.next;
        if(delNode == head){
            head = head.next;
            head.next.prev = null;
            return;
        }

        delNode.prev.next = delNode.next;   
        // only both pointing code that will delete the mid node 
        // for deleting the  end node check the if codn. for the next of delnode not be null
        // here this condn check the last node also
        if(delNode.next != null)
            delNode.next.prev = delNode.prev;
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
