package org.example.datastructures.impl.binarytree;

public class MyBinaryTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
        public void insert(int value){
            if(value <= this.data){
                if(this.left == null){
                    this.left = new Node(value);
                }else{
                    this.left.insert(value);
                }
            } else {
                if(this.left == null){
                    this.right = new Node(value);
                }else{
                    this.right.insert(value);
                }
            }
        }

        public boolean contains(int value){

            if(this.data == value){
                return true;
            }else if(value < this.data){
                if(left == null){
                   return false;
                }else {
                   return left.contains(value);
                }
            } else {
                if(right == null){
                    return false;
                }else {
                    return right.contains(value);
                }
            }
        }

        public void printInOrder(){
            if(left != null){
                left.printInOrder();
            }
            System.out.println(data);
            if(right != null){
                right.printInOrder();
            }
        }
    }

    public static void main(String[] args) {
        MyBinaryTree.Node node = new MyBinaryTree.Node(10);
        node.insert(15);
        node.insert(23);
        node.insert(5);
        node.insert(8);
        node.insert(20);
        node.printInOrder();
    }

}
