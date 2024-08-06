package org.example.datastructures.impl.mystack;

public class MyArrayStack {

    static final int MAX_LIMIT = 1000;
    int a[] = new int[MAX_LIMIT];
    int top;
    MyArrayStack(){
     top = -1;
    }

    public boolean isFull(){
        return top == MAX_LIMIT-1;
    }
    public boolean isEmpty(){
        return top == -1;
    }

    public boolean push(int num){
        if(top >= MAX_LIMIT-1){
            System.out.println("Stack Overflow..!");
            return false;
        }else{
            a[++top] = num;
            return true;
        }
    }
    public int pop(){
        if(top != -1)
            return a[top--];
        else{
            System.out.println("Stack underflow");
            return 0;
        }
    }
    public int peek(){
        if(top != -1)
            return a[top];
        else{
            System.out.println("Stack underflow");
            return 0;
        }
    }

    public int getTop(){
        return this.top;
    }

    public void print() {
        for (int i=this.top; i>=0; i--){
            System.out.print(a[i]+ " ");
        }
        System.out.println();
    }
}
