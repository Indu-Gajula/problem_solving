package org.example.leetcode.goldmansachs;

import java.util.HashMap;

//166 - Medium
public class FractionToRecurringDecimal {

    // numerator - num, denominator - den
    public static String fractionToDecimal(int num, int den){

        // checkif num is 0
        if(num == 0) return "0";
        StringBuilder deci = new StringBuilder();
        // if num or den is neg show - sign for the result
        if((num < 0 ) ^ (den < 0)) deci.append("-");

        // Convert to Long or else abs(-2147483648) overflows
        long dividend = Math.abs(Long.valueOf(num));
        long divisor = Math.abs(Long.valueOf(den));

        deci.append(String.valueOf(dividend/divisor));

        long rem = dividend % divisor;
        if (rem == 0)
            return deci.toString();
        deci.append(".");

        HashMap<Long, Integer> map = new HashMap<>();
        while(rem != 0 ){
            if (map.containsKey(rem)){
                deci.insert(map.get(rem),"(");
                deci.append(")");
                break;
            }
            map.put(rem,deci.length());
            rem *= 10;
            deci.append(rem/divisor);
            rem  %= divisor;
        }

        return deci.toString();
    }

    public static void main(String[] args) {
        System.out.println(fractionToDecimal(1,3));
    }


}
