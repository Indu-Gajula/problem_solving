package org.example.datastructures.impl.mystack;

import java.util.Stack;

public class EvaluateExpressions {

//    public String evaluatePreFixToInfix(String expression){
//
//        Stack<String> stack = new Stack<>();
//
//        for(char c : expression.toCharArray()){
//
//
//        }
//
//
//
//    }

    boolean isOperator(char c){
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
