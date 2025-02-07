package org.example;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumberValid {

    public static void method(int noOfDigits){
        int upperLimit = (int) Math.pow(10,noOfDigits);
        int lowerLimit = (int) Math.pow(10,noOfDigits-1);

        String s = IntStream.range(lowerLimit,upperLimit).boxed()
                .peek(System.out::println)
                .filter(NumberValid::filterValidNumber)
                .map(String::valueOf)
                .collect(Collectors.joining(","));
        System.out.println(s);
    }
    public static boolean filterValidNumber(int number){
        String num = String.valueOf(number);
        int pointer = 1;
        while(pointer<=num.length()-1){
            if( num.charAt(pointer) < num.charAt(pointer-1)){
                return false;
            }
            pointer++;
        }
        return true;
    }
}
