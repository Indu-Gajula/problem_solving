package org.example.practice.mandatory;

import com.fasterxml.jackson.core.io.CharTypes;
import org.example.Main;

import java.util.HashMap;

public class NonRepeatingCharInSubArray {
    // find the maximum index range of substring which has non repeating chars
    // and print the statring and ending indexes
    public static int[] findMaxNonRepeatingSubString(String str){
        HashMap<Character, Integer[]> map = new HashMap<>();
        char[] charA = str.toCharArray();

        for(int i=0; i< charA.length; i++){
            Integer[] arr = new Integer[2];
            if(map.containsKey(charA[i])){
                map.get(charA[i])[1] = i-1;



            }else{
                arr[0] = i;
                map.put(charA[i],arr);
            }

        }
        return new int[2];
    }

    // brut force
    public static int findMaxLengthOfNonRepSubString(String str){
        int maxLen = 0;
        for(int i =0 ; i < str.length(); i++){
            StringBuilder sb = new StringBuilder();
            for (int j =i; j<str.length(); j++){
                if(sb.indexOf(String.valueOf(str.charAt(j))) != -1){
                    break;
                }
                sb.append(str.charAt(j));
                maxLen = Math.max(maxLen,sb.length());
            }
        }
        return maxLen;
    }

    // better using hashmap
    public static int findMaxLength(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLen = 0;
        for(int right=0, left =0; right<str.length(); right++){
            char curr = str.charAt(right);
            if(map.containsKey(curr) && map.get(curr) >= left){
                left = map.get(curr)+1;
            }
            maxLen = Math.max(maxLen,right-left+1);
            map.put(curr,right);
        }
        return maxLen;
    }

    //  notusing hashmap , constant space
    public static int findMaxLength1(String str){

        int maxLen = 0;
        for(int right=0, left =0; right<str.length(); right++){
            char curr = str.charAt(right);
            int firstPositionOfCurrCharInSubString = str.indexOf(curr,left);
            if(firstPositionOfCurrCharInSubString != right){
                left = firstPositionOfCurrCharInSubString+1;
            }
            maxLen = Math.max(maxLen,right-left+1);

        }
        return maxLen;
    }

}
