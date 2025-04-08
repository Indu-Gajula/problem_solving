package org.example.assessment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LuhnPractice {

    public boolean isValid(String number) {
        int len = number.length();
        int sum = 0;
        for(int i=0; i<len; i++){
            char c = number.charAt(len-1-i);
            if(i%2 == 0){
                int d = (c - '0')*2;
                String s = String.valueOf(d);
                if(s.length() == 2){
                    d = s.charAt(0) - '0' +s.charAt(1) - '0';
                }
                sum+=d;
            }else {
                sum += c - '0';
            }
        }
        return sum%10 == 0;
    }

    public boolean isValid1(String number) {
        int len = number.length();
        int sum = 0;
        for(int i=0; i<len; i++){
            int c = number.charAt(len-1-i) - '0';
            if(i%2 == 0){
                int d = c*2;
                if(d>=10){
                    d = d/10 + d%10;
                }
                sum+=d;
            }else {
                sum += c;
            }
        }
        return sum%10 == 0;

    }

    public static boolean isValidUsingIntStream(String number){
        int len = number.length();
        return IntStream.range(0, len).map( i -> {
            int k = Integer.parseInt(String.valueOf(number.charAt(len-1-i)));
            if(i%2 != 0){
                k = k*2;
                if(k > 9){
                    k = k/10 + k%10;
                }
                return k;
            }
            return k;
        }).sum() %10 == 0;

    }


    public static boolean isValidUsingIntStreamAndStreams(String number){
        int len = number.length();
        return IntStream.range(0, len)
                .peek( i -> System.out.println("index : "+i))
                .map(i -> i%2 != 0 ? Integer.parseInt(String.valueOf(number.charAt(len-1-i)))*2 : Integer.parseInt(String.valueOf(number.charAt(len-1-i))) )
                .peek(i -> System.out.println(i))
                .map(i -> i>9 ? (i/10+i%10) : i)
                .peek(i-> System.out.println(i))
                .sum() %10 == 0;
    }

    public static boolean isValidUsingStreamsProperlywith(String number) throws NumberFormatException{
        int[] multiply = {number.length()%2 == 0 ? 1:2};
        return number.chars()
                .peek( i -> System.out.println("value : "+ (char)i))
                .map(i -> Integer.parseInt(String.valueOf((char) i)))
                .map(i-> i*(multiply[0]= multiply[0] == 2 ? 1: 2 ))
                .peek( i -> System.out.println("after mul : "+ i))
                .map(i-> i>9 ? i/10+i%10 : i)
                .peek( i -> System.out.println("after adding digits : "+ i))
                .sum() % 10 == 0;
    }

    public static void main(String[] args) {
        System.out.println(isValidUsingStreamsProperlywith("4242424242426742"));
    }


}
