package org.example.leetcode.goldmansachs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {
    public static List<List<String>> groupAnagrams(String[] strs){
        if(strs.length == 0){
            return new ArrayList<>();
        }
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            char []chars = s.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            if(!map.containsKey(sorted)){
                map.put(sorted,new  ArrayList<>());
            }
            map.get(sorted).add(s);
        }
        return new ArrayList(map.values());
    }

    // diff approach
    public static List<List<String>> groupAnagrams1(String[] strs){
        if(strs.length == 0){
            return new ArrayList<>();
        }
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            int []freq = new int[26];
            for(char c : s.toCharArray()){
                freq[c-'a'] += 1;
            }
            StringBuilder sb = new StringBuilder();
            for(int i =0; i<26;  i++){
                sb.append("#");
                sb.append(freq[i]);
            }
            String key = sb.toString();
            if(!map.containsKey(key)){
                map.put(key,new  ArrayList<>());
            }
            map.get(key).add(s);
        }
        return new ArrayList(map.values());
    }

    public static void main(String[] args) {
        groupAnagrams(new String[]{"eat","ate","nat","tan","tea"}).forEach(System.out::println);
    }
}
