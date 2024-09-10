package org.example.datastructures.algo;



public class ReverseALinkedLIst {
    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
            this.next = null;
        }
    }
    static void reverseALinkedList(Node head){
        Node curr = head;
        Node next ;
        Node prev = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;

        printLinkedList(head);
    }

    public static void printLinkedList(Node head){
        System.out.println("Linked List: ");
        Node curr = head;
        while(curr != null){
            System.out.print(curr.val);
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node n = new Node(1);
        n.next = new Node(2);
        n.next.next = new Node(3);
        n.next.next.next = new Node(4);

        ReverseALinkedLIst.reverseALinkedList(n);
    }


    public static Node reverse(Node head){

        if(head.next == null){
            return head;
        }
        Node prev = null;
        Node curr = head;
        while(curr != null){
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        head = prev;
        return head;

    }
}
