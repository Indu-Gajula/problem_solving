package org.example.leetcode.goldmansachs;

//1832 - Easy
public class Pangram {
    public boolean checkIfPangram(String sentence) {
        int[] freq = new int[26];
        for(char c : sentence.toCharArray()){
            freq[c-'a']++;
        }
        for(int i=0; i<26; i++){
            if(freq[i] == 0)
                return false;
        }
        return true;
    }

}
