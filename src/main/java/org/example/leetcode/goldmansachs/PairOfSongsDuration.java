package org.example.leetcode.goldmansachs;

import java.util.HashMap;

//1010 - medium
public class PairOfSongsDuration {

    public static int numPairsDivisibleBy60(int[] time) {

        HashMap<Integer, Integer> exists = new HashMap<>();
        int ans = 0;
        for(int i=0; i<time.length; i++){
            int rem = time[i] % 60;
            int target = 60-rem;
            if(exists.containsKey(target)){
                ans += exists.get(target);
            }
            if(rem != 0){
                exists.put(rem, exists.getOrDefault(rem,0)+1);
            }else
            {
                exists.put(60, exists.getOrDefault(60,0)+1);
            }
        }
        return ans;
    }
    public static int numPairsDivisibleBy60_(int[] time) {

        HashMap<Integer, Integer> exists = new HashMap<>();
        int ans = 0;
        for(int i=0; i<time.length; i++){
            int rem = time[i] % 60;
            int target = 60-rem;
            ans += exists.getOrDefault(target,0);
            if(rem != 0){
                exists.put(rem, exists.getOrDefault(rem,0)+1);
            }else
            {
                exists.put(60, exists.getOrDefault(60,0)+1);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(numPairsDivisibleBy60(new int[]{30,20,150,100,40})); // 3
        System.out.println(numPairsDivisibleBy60_(new int[]{30,20,150,100,40}));
    }
}
