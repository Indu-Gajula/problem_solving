package org.example.datastructures.impl;

public class Client {
    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();
        MyLinkedList.insertNodeAtStart(myLinkedList,3);
        MyLinkedList.insertNodeAtStart(myLinkedList,1);
        MyLinkedList.insertNodeAtEnd(myLinkedList,5);
        MyLinkedList.deleteNode(myLinkedList,3);
        MyLinkedList.printLinkedList(myLinkedList);

    }
}
