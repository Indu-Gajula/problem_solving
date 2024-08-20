package org.example.leetcode.goldmansachs;


// easy - 387
public class FirstUniqueChar {

    public static int firstUniqChar(String s) {

        int[] freq = new int[26];
        char[] arr = s.toCharArray();

        for(char c : arr){
            freq[ c - 'a']++;
        }
        for(int i=0; i< s.length(); i++){
            if(freq[ s.charAt(i) - 'a'] == 1)
                return i;
        }
        return -1;

    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("eetcode")); // 2
    }
}
