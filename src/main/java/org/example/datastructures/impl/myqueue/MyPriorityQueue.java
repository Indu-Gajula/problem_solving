package org.example.datastructures.impl.myqueue;

public class MyPriorityQueue {

    private int MAX;
   private  int noOfItems;
   private  int[] arr;

    MyPriorityQueue(){
        MAX = 20;
        arr = new int[MAX];
        noOfItems = 0;
    }

    boolean offer(int num){

        if(noOfItems == 0){
            arr[0] =num;
            noOfItems++;
            return true;
        }
        // 1 2 4 5
        if(noOfItems != MAX){
            int i;
            for( i=noOfItems-1;i>0;i--){
                if(num < arr[i]){
                    arr[i+1] = arr[i];
                }else{
                    break;
                }
            }
            arr[i+1] = num;
            noOfItems++;
            return true;
        }
        return false;
    }

    int pop(){
        int a = arr[0];
        for(int i=1; i<noOfItems;i++){
            arr[i-1] = arr[i];
        }
        noOfItems--;
        return a;
    }

    int peek(){
        return arr[0];
    }

    boolean isFull(){
        return MAX == noOfItems;
    }

    boolean isEmpty(){
        return noOfItems == 0;
    }

    void printQueue(){
        for (int i = 0; i < noOfItems; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
    }


}
