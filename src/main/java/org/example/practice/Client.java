package org.example.practice;

import org.example.utility.Utility;

import java.util.Arrays;


public class Client {
    public static void main(String[] args) {
        // https://www.youtube.com/watch?v=2ZLl8GAk1X4
        System.out.println(RemoveVowels.removeVowelsFromSmallLetterString("my name is indu"));
        System.out.println(FirstNonOccuringChar.getFirstNonOccuringChar("codeforcode"));
        RemoveEvenIntegersFromArray.reverseArray(new int[]{1,2,3,4,5});
        System.out.println();
        Arrays.stream(RemoveEvenIntegersFromArray.removeEvenElementsFromArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8}))
                .forEach(System.out::print);
        System.out.println(Utility.reverseString("idn"));

    }
}
