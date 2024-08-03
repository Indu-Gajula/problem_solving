package org.example.datastructures.impl;


public class MyLinkedList {

   Node head;
   MyLinkedList(){}

   MyLinkedList(int data){
       this.head = new Node(data);
   }
   static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }

    }
    public static void insertNodeAtStart(MyLinkedList linkedList,int data){

        Node newNode = new Node(data);

        newNode.next = linkedList.head;
        linkedList.head = newNode;

    }
    public MyLinkedList insertNodeInMiddle(MyLinkedList linkedList , int data){

       return linkedList;
    }
    public static void insertNodeAtEnd(MyLinkedList linkedList, int data){

        if(linkedList.head == null){
            linkedList.head = new Node(data);
        }

        Node pointer = linkedList.head;
        while(pointer.next != null){
            pointer = pointer.next;
        }
        pointer.next = new Node(data);


    }

    public static void deleteNode(MyLinkedList linkedList, int data){

       Node currNode = linkedList.head;
       Node prev = null;

       //where head itself is holding data
        if (currNode != null && currNode.data == data) {
            linkedList.head = currNode.next; // Changed head
            System.out.println(data + " found and deleted");
            return;
        }

        // data is held by node, other than head

        while(currNode != null && currNode.data != data){
           prev = currNode;
           currNode = currNode.next;
       }
       if(currNode != null){
           prev.next = currNode.next;

       }else{
           System.out.println(data +" is not found");
       }



    }


    public static void printLinkedList(MyLinkedList list){
        System.out.println("Linked List: ");
        Node traverse = list.head;
       while(traverse != null){
           System.out.print(traverse.data);
           traverse = traverse.next;
       }
        System.out.println();

    }



}



