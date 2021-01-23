package com.linkedlistds;

public class Main {

    public static void main(String[] args) {
	// write your code here

        LinkedList list = new LinkedList();         // new object of LinkedList class
        list.insertAtBeg(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        // for insert a node  at the end we have to go to last node
        list.insertAtMid(2,4);    // here num is for which we have to insert an element after that

//        list.printList();
//          list.deleteFirst(1);
//          list.printList();

        list.delete_Mid_Last(3);
        list.printList();

    }
}
