package org.example.leetcode.practice.stack;

import java.util.ArrayDeque;
import java.util.Queue;

public class StackUsingQueue {
    Queue<Integer> queue;
    StackUsingQueue(){
        queue = new ArrayDeque<>();
    }
    public void push(int n){
        queue.add(n);
        for(int i=1; i<queue.size();i++){
            queue.add(queue.remove());
        }
    }
    public Integer pop(){
        return queue.poll();
    }
    public Integer peek(){
        return queue.peek();
    }
    public boolean isEmpty(){
        return queue.isEmpty();
    }


}
