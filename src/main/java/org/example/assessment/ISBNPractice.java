package org.example.assessment;

import java.util.stream.IntStream;

public class ISBNPractice {

    public static boolean isValid(String s) {
        if(s == null || s.isBlank()) return false;
        int sum = 0;
        for(int i = s.length(); i >= 1; i--){
            int number = 0;
            try {
                number = 'X' == s.charAt(i - 1) ? 10 : Integer.parseInt(String.valueOf(s.charAt(i - 1)));
            }catch (NumberFormatException e){
                return false;
            }
            sum += number * i;
        }
        return sum %11 == 0;
    }

    public static boolean isValidUsingIntStream(String str){
        if(str == null || str.isBlank()) return false;
        return IntStream.rangeClosed(1,str.length())
                .map(i -> i * ('X' == str.charAt(i-1) ? 10: Integer.parseInt(String.valueOf(str.charAt(i-1)))))
                .sum() % 11 == 0;

    }

    public static boolean isValidUsingIntStreamIndexReverse(String str){
        if(str == null || str.isBlank()) return false;
        int len = str.length();
        return IntStream.rangeClosed(1,len)
                .map(i -> len-i+1)
                .map(i -> i * ('X' == str.charAt(i-1) ? 10: Integer.parseInt(String.valueOf(str.charAt(i-1)))))
                .sum() % 11 == 0;
    }
    public static void main(String[] args) {
        System.out.println(isValidUsingIntStreamIndexReverse("359821507X"));;
    }

}
