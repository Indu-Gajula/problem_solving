package org.example.leetcode.goldmansachs;


import java.util.ArrayList;
import java.util.List;

public class DigitsNotMatchingInNumber {
    // given a range (l,r) and a number q, numbers from l to r are multiplayed by q gets the result
    // check if the digits in result and the digits in that number are matching, return the numbers that have no common digits

    public static List<Integer> getTheNumbersWithNoMatchingDigits(int l, int r, int q){

        List<Integer> list = new ArrayList<>();
        for(int i=l; i<=r; i++ ) {
            if(!isMatching(i*q,i)){
                list.add(l);
            }

        }

        return list;
    }
    public static boolean isMatching(int num, int l){

        boolean []isDigitPresent = new boolean[10];

        while(num != 0){
             isDigitPresent[num%10] = true;
             num = num/10;
        }
        while(l != 0){
            if(isDigitPresent[l%10])
                return true;
            l = l/10;
        }

        return false;
    }

}









// Initial Draft:


/*
*  public List<Integer> getTheNumbersWithNoMatchingDigits(int l, int r, int q){
        int []nums = new int[r-l+1];
        List<Integer> list = new ArrayList<>();
        for(int i=l, j=0; i<=r; i++,j++ ) {
            nums[j] = i*q;
        }
        for(int num : nums){
           boolean flag =  isMatching(num,l);
           if(!flag){
               list.add(l);
           }
           l++;
        }

        return list;
    }
    public boolean isMatching(int num, int l){
        HashSet hs = new HashSet();
        for(char c : String.valueOf(num).toCharArray()){
            hs.add(c);
        }
        for(char c : String.valueOf(l).toCharArray()){
            if(hs.contains(c))
                return true;
        }
        return false;
    }
*
* */