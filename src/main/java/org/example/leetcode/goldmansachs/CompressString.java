package org.example.leetcode.goldmansachs;

import ch.qos.logback.core.model.INamedModel;

import java.util.HashMap;
import java.util.Map;

// 443 - medium // happy... i solved it in one go ...// can be modified later for modularity
public class CompressString {
    public static int compress(char[] chars) {

        if(chars.length == 1){
            return 1;
        }
        int charsPosition = 0 ;
        int start =0;
        char prev = chars[0];
        for(int i=0; i<chars.length; i++){
            if(prev != chars[i]){
                chars[charsPosition++] = prev;
                int noOfTimes = i-start;
                if(noOfTimes > 1){
                    String str = String.valueOf(noOfTimes);
                    int n = str.length();
                    int k=0;
                    while(k<n){
                        chars[charsPosition++] = str.charAt(k);
                        k++;
                    }
                }
                prev = chars[i];
                start = i;
            }
        }
        chars[charsPosition++] = chars[chars.length-1];
        if(chars.length-start > 1){
            String str = String.valueOf(chars.length-start);
            int n = str.length();
            int k=0;
            while(k<n){
                chars[charsPosition++] = str.charAt(k);
                k++;
            }
        }

        return charsPosition;
    }

    public static int getLengthOfCompressedString(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        char[] chars = str.toCharArray();
        for (char c : chars){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int length = 0;
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            int num = entry.getValue();
            int count = 0;
            while(num != 0){
                num = num/10;
                count++;
            }
            length += count+1;
        }
        return length;
    }


    public static void main(String[] args) {
        System.out.println(compress(new char[]{'a','a','b','b','c','c','c'}));
        System.out.println(getLengthOfCompressedString("aabbbbbbbbbbbbbbbbbcccccccccccccccccc"));
    }
}
