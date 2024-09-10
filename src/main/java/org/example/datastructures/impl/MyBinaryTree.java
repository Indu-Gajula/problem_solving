package org.example.datastructures.impl;

public class MyBinaryTree {

    Node root;

    MyBinaryTree(){
        root = null;
    }
    MyBinaryTree(int value){
        root = new Node(value);
    }
    static class Node{
        private int value;
        Node left;
        Node right;

        Node(int value){
            this.value = value;
            left = right = null;
        }
    }

    static void bfsPrint(Node root){


    }

    public static void main(String[] args) {
        MyBinaryTree binaryTree = new MyBinaryTree(1);
        binaryTree.root.left = new Node(2);
        binaryTree.root.right = new Node(3);
        binaryTree.root.left.left = new Node(4);
        binaryTree.root.left.right = new Node(5);
        binaryTree.root.right.left = new Node(6);
        binaryTree.root.right.right = new Node(7);
        bfsPrint(binaryTree.root);



    }




}
