package org.example.assessment;

import java.util.stream.IntStream;

public class ISBN {

    public  static  boolean isValidISBn(String str){

        int len = str.length();
         return IntStream.range(0,len).
                map(i-> len - i)
                .map(i -> str.charAt(i-1) == 'X' ? (10 * i) : (i* Character.getNumericValue(str.charAt(i-1))))
                .sum() %11 ==0;


    }

    public static boolean  isISSBNForLoop(String str){
        int sum = 0;
        int len = str.length();
        for(int i = 0; i < len ; i++){

            char c = str.charAt(i);
            int num = ( c == 'X' ? 10 : Character.getNumericValue(c));
            int prod = num * (len - i);
            sum += prod;

        }


        return sum % 11 == 0;
    }
}
