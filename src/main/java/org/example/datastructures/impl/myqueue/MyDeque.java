package org.example.datastructures.impl.myqueue;

// Deque using doubly linkedlist
public class MyDeque {

    int data;
    Node front;
    Node rear;

    int size;

    static class Node{
        int data;
        Node prev, next ;
        Node(int data){
            this.data = data;
           this.prev = null;
           this.next = null;
        }
    }

    boolean isEmpty(){
        return front == null;
    }
    int size(){
        return size;
    }

    void insertFront(int data){

        Node newNode = new Node(data);
        // do not know what this null check for
        if(front == null){
            front = rear = newNode;
        } else{
            newNode.next = front;
            front.prev = newNode;
            front = newNode;
        }
        size++;


    }

    void insertRear(int data){

        Node newNode = new Node(data);
        // do not know what this null check for
        if(rear == null){
            front = rear = newNode;
        } else{
            newNode.prev = rear;
            rear.next = newNode;
            rear = newNode;
        }
        size++;

    }
    void deleteFront(){
        if(isEmpty()){
            System.out.println("underflow");
        }else{
            front = front.next;
            if(front == null){
                rear = null;
            }else{
                front.prev = null;
            }
        }
        size--;
    }

    void deleteRear(){
        if(isEmpty()){
            System.out.println("underflow");
        }else{
            rear = rear.prev;
            if(rear == null){
                front = null;
            }else{
                rear.next = null;
            }
        }
        size--;
    }
    int getFront(){
        if (isEmpty())
            return -1;
        return front.data;
    }

    int getRear(){
        if (isEmpty())
            return -1;
        return rear.data;
    }
    void erase(){
        rear = null;
        while(front != null){
            front = front.next;
        }
        size = 0;
    }



}
