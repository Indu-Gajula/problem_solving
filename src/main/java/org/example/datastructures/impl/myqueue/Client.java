package org.example.datastructures.impl.myqueue;

public class Client {

    public static void main(String[] args) {
        MyPriorityQueue mq = new MyPriorityQueue();
        mq.offer(10);
        mq.offer(1);
        mq.offer(3);
        mq.offer(5);
        mq.pop();
        mq.peek();
        mq.printQueue();
        System.out.println(mq.isFull() + " " + mq.isEmpty()+ " " + mq.peek());


    }

}
