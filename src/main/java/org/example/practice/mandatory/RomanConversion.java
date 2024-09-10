package org.example.practice.mandatory;

import org.example.exception.CannotConvertRomanToLongException;

public class RomanConversion {

    public static long convertRomanToLong(String roman) throws Exception {

        long result = 0;
        int prev = 0;

        for (int i = roman.length() - 1; i >= 0; i--) {
            switch (roman.charAt(i)) {
                case 'I' -> {
                    result = addSubToFromResult(result, 1, prev);
                    prev = 1;
                }
                case 'V' -> {
                    result = addSubToFromResult(result, 5, prev);
                    prev = 5;
                }
                case 'X' -> {
                    result = addSubToFromResult(result, 10, prev);
                    prev = 10;
                }
                case 'L' -> {
                    result = addSubToFromResult(result, 50, prev);
                    prev = 50;
                }
                case 'C' -> {
                    result = addSubToFromResult(result,100,prev);
                    prev = 100;
                }
                case 'D' -> {
                    result = addSubToFromResult(result,500,prev);
                    prev = 500;
                }
                case 'M' -> {
                    result = addSubToFromResult(result,1000,prev);
                    prev = 1000;
                }
                default -> {
                    throw new CannotConvertRomanToLongException("Something went wrong...! Cannot convert from roman to long -> invalid input");
                }

            }
        }

        return result;
    }

    public static long addSubToFromResult(long result, int num, int prev) {
        if (prev > num) result -= num;
        else result += num;
        return result;
    }


}
