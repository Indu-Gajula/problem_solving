package org.example.datastructures.impl;

public class Client {
    public static void main(String[] args) {

        // Insert
        MyLinkedList myLinkedList = new MyLinkedList(5);
        MyLinkedList.insertNodeAtStart(myLinkedList,3);
        MyLinkedList.insertNodeAtStart(myLinkedList,1);
        MyLinkedList.insertNodeAtEnd(myLinkedList,7);
        MyLinkedList.insertNodeAfterThis(myLinkedList,7,5);
        MyLinkedList.insertNodeBeforeThis(myLinkedList,6,7);

        // Search / Find and replace
        myLinkedList.findAndReplace(7,9);

        MyLinkedList.printLinkedList(myLinkedList);

        // reverse a linked list
        myLinkedList.reverse();
        MyLinkedList.printLinkedList(myLinkedList);

        myLinkedList.reverseUsingStack();

        MyLinkedList.printLinkedList(myLinkedList);
        //Delete
        MyLinkedList.deleteNode(myLinkedList,7); // deletes the first occurance
        myLinkedList.deleteNodeAtPosition(2);
        MyLinkedList.printLinkedList(myLinkedList);
        myLinkedList.deleteLastNode();
        MyLinkedList.printLinkedList(myLinkedList);
        myLinkedList.deleteNthNodeFromEnd(2);

        MyLinkedList.printLinkedList(myLinkedList);

        //length of linked list
        System.out.println("The length of linkedlist is : "+ myLinkedList.length());


    }
}
