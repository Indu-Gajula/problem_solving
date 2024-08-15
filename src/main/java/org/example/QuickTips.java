package org.example;

public class QuickTips {
    public static void main(String[] args) {
        char[] c = new char[]{'a','s','d','f','g'};
        System.out.println(new String(c,0,3));
        System.out.println(String.valueOf(c,0,3));

        int n=0; int k =1;
        if( (n==0)^(k==0)){
            System.out.println("either of the 2 conditions should be true, but not both");
        }


    }
}
