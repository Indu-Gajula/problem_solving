package org.example.practice.mandatory;

import java.util.HashSet;

public class FirstSmallestPositiveNumMIssing {
    // -1,2,3,1,6,7,4,-3,


    // time complexity O(N), space complexity O(N)
    public static int findSmallestPositiveNumMissing(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for (int i: nums){
            if(i>=0)
             set.add(i);
        }
        int i=1;
        while(i>=0){
           if(!set.contains(i)) return i;
           i++;
        }
        return nums.length;

    }

    // space complexity O(1), time complexity - O(N)
    public static int findSmallestPositiveNumMissingWithoutSet(int[] nums){

        int len = nums.length;
        for (int i = 0; i < len; i++){
            if(nums[i] <= 0)
                nums[i] = len+1;
        }
        for(int i = 0 ; i< len; i++){
            int x = Math.abs(nums[i]);
            if(x<=len && nums[x-1] > 0)
                nums[x-1] *= -1;
        }
        for(int i = 0 ; i< len; i++){
            if(nums[i]>0)
                return i+1;
        }
        return nums.length;

    }




    public static void main(String[] args) {
        System.out.println(findSmallestPositiveNumMissingWithoutSet(new int[]{-1,2,3,1,6,7,4,-3}));
        System.out.println(findSmallestPositiveNumMissing(new int[]{-1,2,3,1,6,7,4,-3}));
    }
}
