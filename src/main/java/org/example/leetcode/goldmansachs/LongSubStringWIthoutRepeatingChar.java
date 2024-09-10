package org.example.leetcode.goldmansachs;

import org.example.utility.Utility;

import java.util.HashSet;
import java.util.Set;

//
public class LongSubStringWIthoutRepeatingChar {

    public static int lengthOfLongestSubstring(String s) {
        int j=0,max=0;
        Set<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i))){
                while(s.charAt(i)!=s.charAt(j)){
                    set.remove(s.charAt(j));
                    j++;
                }
                j++;
            }
            set.add(s.charAt(i));
            max=Math.max(max,set.size());
        }
        return max;
    }

    //optimal -- O(n)
    public static int lengthOfLongestSubstring1(String s) {

        int start = 0;
        int maxLength = 0;
        int[] LastIndex = new int[128];

        for (int index = 0; index < s.length(); index++) {
            char charNow = s.charAt(index);
            start = Math.max(start,LastIndex[charNow]);
            maxLength = Math.max(maxLength, index-start+1);
            LastIndex[charNow] = index+1;
        }
        return maxLength;

    }

    public static int[] indicesOfLongestSubstring(String s) {

        int start = 0;
        int maxLength = 0;
        int[] LastIndex = new int[128];
        int[] indices = new int[2];

        for (int index = 0; index < s.length(); index++) {
            char charNow = s.charAt(index);
            start = Math.max(start,LastIndex[charNow]);
//            maxLength = Math.max(maxLength, index-start+1);
            if(maxLength < index-start+1 ){
                maxLength = index-start+1;
                indices[0] = start;
                indices[1] = index;
            }
            LastIndex[charNow] = index+1;
        }
        System.out.println("length :" + maxLength);
        return indices;

    }


    // for practice
    public static int findMaxLengthOfSubStringNonRe(String str){

        int[] newStartingPoint = new int[128];
        int start = 0;
        int maxLen = 0;

        for(int index = 0; index<str.length(); index++){
            char c = str.charAt(index);
            start = Math.max(start,newStartingPoint[c]);
            maxLen = Math.max(maxLen, index -start+1);
            newStartingPoint[c] = index+1;
        }
        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcakbcbb"));
        System.out.println(lengthOfLongestSubstring1("abcakbcbb"));
        Utility.printArray(indicesOfLongestSubstring("abcakbcbb"));
    }




}
