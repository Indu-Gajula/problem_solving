package org.example.datastructures.impl.mystack;

import java.util.Stack;

public class EvaluateExpressions {

    public static String evaluatePreFixToInfix(String expression){

        Stack<String> stack = new Stack<>();
        int len = expression.length();
        for(int i = len-1; i >= 0 ; i-- ){
            char c = expression.charAt(i);
            if(!isOperator(c)){
                stack.push(String.valueOf(c));
            }else{
                String opr1 = stack.pop();
                String opr2 = stack.pop();
                String temp = "(" + opr1 + c + opr2 + ")";
                stack.push(temp);
            }

        }
        return stack.pop();

    }

   static boolean isOperator(char c){
        switch(c){
            case '+' :
            case '-' :
            case '*' :
            case '/' :
            case '%' : return true;
        }
        return false;
    }
}
