package org.example.practice.mandatory;

import java.util.HashMap;

public class TwoSum {

    public int[] findTwoSum(int[] nums, int target) {

        HashMap<Integer, Integer> targetMap = new HashMap<>();
        for(int  i=0; i<nums.length; i++){
            Integer remaining = target - nums[i];
            if(targetMap.containsKey(remaining)){
                return new int[]{targetMap.get(remaining), i};
            }else{
                targetMap.put(Integer.valueOf(nums[i]),Integer.valueOf(i));
            }
        }
        return new int[2];
    }

}
