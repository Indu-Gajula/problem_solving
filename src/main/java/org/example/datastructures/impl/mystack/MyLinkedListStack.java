package org.example.datastructures.impl.mystack;



public class MyLinkedListStack {

    Node head;
    MyLinkedListStack(){
    }

    public void print() {
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }

    }
    public boolean isEmpty() {
        return this.head == null;
    }
    public void push(int data){

        Node newNode = new Node(data);
        if(this.head == null){
            head = newNode;
        }else {
        newNode.next = head;
        head = newNode;
        }


    }
    public int pop(){
        if(head == null){
            System.out.println("Stack underflow");
            return 0;
        }
        int val = head.data;
        head = head.next;
        return val;
    }
    public int peek(){
       if (head == null){
           System.out.println("Stack underflow");
           return 0;
       }else{
           return head.data;
       }
    }


}
