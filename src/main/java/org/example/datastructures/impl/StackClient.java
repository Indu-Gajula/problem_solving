package org.example.datastructures.impl;

public class StackClient {
    public static void main(String[] args) {
        MyArrayStack s = new MyArrayStack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
        System.out.println("Top element is :" + s.peek());
        System.out.print("Elements present in stack :");
        s.print();

        MyLinkedListStack ls = new MyLinkedListStack();
        ls.push(10);
        ls.push(20);
        ls.push(30);
        System.out.println(ls.pop() + " Popped from stack");
        System.out.println("Top element is :" + ls.peek());
        System.out.print("Elements present in stack :");
        ls.print();


    }
}
