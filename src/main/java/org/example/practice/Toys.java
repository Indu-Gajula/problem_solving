package org.example.practice;

public class Toys {


    // no of children -- n
    // no of toys    -- t
    // from where the distribution has started -- position of child k,
    // children are sitting around the circular table
    // then if there are n children sitting around a circular table,
    // toys distibution is started from i'th(1 to n) child, and there are t toys,
    // what is the child position who got the last gift.
    public static void findThePositionOfchild(int n, int t, int k){

        // distribution starting from 1st position
        // 4, 8, 1 --> 4
        // 4, 9, 1 --> 1
        // 4, 3, 1 --> 3
        // 4, 4, 1 --> 4
        // 4, 1, 1 --> 1
        // distribution starting from 2nd position
        // 4, 8, 2 --> 1
        // 4, 9, 2 --> 2
        // 4, 3, 2 --> 4
        // 4, 4, 2 --> 1
        // 4, 1, 2 --> 2

        int value = (((t-1) % n)+k-1)%n+1;
        System.out.println(value);



    }
    public static void main(String[] args) {
        Toys.findThePositionOfchild(4,3,2);
    }
}
