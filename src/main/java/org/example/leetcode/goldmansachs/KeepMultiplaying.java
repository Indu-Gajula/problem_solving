package org.example.leetcode.goldmansachs;
//2154 - easy
public class KeepMultiplaying {

    public static int findFinalValue(int[] nums, int original) {

        while(isFound(original, nums)){
            original *=2;
        }
        return original;
    }

    static boolean isFound(int num, int[] nums){
        for(int i=0; i<nums.length; i++){
            if(nums[i]==num) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(findFinalValue(new int[]{5,3,6,1,12}, 3));
    }
}
