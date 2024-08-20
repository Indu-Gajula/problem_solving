package org.example.practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class FrequencyArray {

    //TODO
    public static void findFrequencyOfEachElementInAnArray(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        // find number repeated for max times
        int maxValue = Integer.MIN_VALUE;
        int key = -1;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int value = entry.getValue();
            if(maxValue < value){
                maxValue = value ;
                key = entry.getKey();
            }
        }
        System.out.println(key + "  " + maxValue);
    }


    public static void main(String[] args) {
        findFrequencyOfEachElementInAnArray(new int[]{1,2,3,4,5,1,2,3,4,5,1,3,3,3,34,4});
    }
}
