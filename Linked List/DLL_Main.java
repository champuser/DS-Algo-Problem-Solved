package com.dlllinkedlists;

// DoublyLinked List

public class DllMain {

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();      // new object of class DoublyLinkedList
        dll.insertAtBeg(4);
        dll.insertAtBeg(5);
        dll.insertAtBeg(6);

        dll.printList();
        dll.insertAtEnd(8);
        dll.printList();


    }
}
