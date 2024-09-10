package org.example.practice.mandatory;

import java.util.Stack;

public class ReverseOfAString {

    public static String reverseAString(String str){

        String newStr ="";
        for(char c : str.toCharArray()){
            newStr = c+newStr;
        }
        return newStr;

    }
    public static boolean isPalindromString(String str){
        String rev = reverseAString(str);
        if(rev.equals(str))
            return true;
        return false;
    }

    public static boolean isPalindromString1(String str){
        Stack<Character> stack = new Stack<>();
        for(char c : str.toCharArray()){
            stack.push(c);
        }
        for(char c : str.toCharArray()){
            if(c != stack.pop())
                return false;
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.println(reverseAString("indu"));
        System.out.println(isPalindromString("abaa"));
        System.out.println(isPalindromString1("abaaba"));


    }
}
