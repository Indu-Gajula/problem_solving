package org.example.datastructures.impl.mylinkedlist;

import java.util.Stack;

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
    public static void insertNodeAfterThis(MyLinkedList linkedList , int data,int key){

       Node curr = linkedList.head;
       while(curr != null && curr.data != key){
           curr = curr.next;
       }
       if(curr != null){
           Node dataNode = new Node(data);
           dataNode.next = curr.next;
           curr.next = dataNode;
       }else{
           System.out.println("Element is not found..! " + key + " to insert "+ data);
       }


    }

    public static void insertNodeBeforeThis(MyLinkedList linkedList , int data, int key){

        Node curr = linkedList.head;
        Node prev = null;
        while(curr != null && curr.data != key){
            prev = curr;
            curr = curr.next;
        }
        if(curr != null){
            Node dataNode = new Node(data);
            dataNode.next = curr;
            prev.next = dataNode;

        }else{
            System.out.println("Element is not found..! " + key + " to insert "+ data);
        }


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



    public void deleteNodeAtPosition( int position){

       int pointer = 1;
       if(this.head == null){
           System.out.println("list is empty");
           return;
       }
       if(position == 1){
           this.head = this.head.next;
       }else{
           Node curr = this.head;
           Node prev = null;
           while(curr != null && pointer != position){
               pointer++;
               prev = curr;
               curr = curr.next;
           }
           if(curr != null){
               prev.next = curr.next;
           }else{
               System.out.println("List do not have element at the position specified");
           }
       }

    }

    public void deleteLastNode(){
       Node curr = this.head;
       while(curr.next.next != null){
           curr = curr.next;
       }
       curr.next = null;
    }

    public void findAndReplace(int key, int data){

       Node curr = this.head;
       while(curr != null && curr.data != key){
            curr = curr.next;
       }
       if(curr != null){
           curr.data = data;
           return;
       }
       System.out.println("Element is not found to replace");

    }

    public int length(){

       int len =0;
       Node h = this.head;
       while (h != null){
           len++;
           h = h.next;
       }
       return len;
    }
    public void reverse() {

       Node prev = null;
       Node curr = this.head;
       Node nextNode;
       while(curr != null){

           nextNode = curr.next;
           curr.next = prev;
           prev = curr;
           curr = nextNode;

       }
        this.head = prev;

    }
    // reverse using stack

    public void reverseUsingStack(){
        Stack<Node> stack = new Stack<>();
        Node temp = this.head;
        while(temp != null){
            stack.push(temp);
            temp = temp.next;
        }

        if(!stack.isEmpty()){
            this.head = stack.pop();
            temp = this.head;
            while (!stack.isEmpty()){
                temp.next = stack.pop();
                temp = temp.next;
            }
            temp.next = null;
        }

    }
    public void deleteNthNodeFromEnd(int positionfromEnd){

       Node curr = this.head;
       int len = 0;

       while(curr != null){
           len++;
           curr = curr.next;
       }
       if(len < positionfromEnd)
           return;

       int position = len - positionfromEnd+1;
       this.deleteNodeAtPosition(position);

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



