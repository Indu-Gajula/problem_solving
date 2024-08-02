package org.example;

import java.util.Stack;

public class FindUniques {
    public int[] singleNumber(int[] nums) {
        if(nums.length == 2){
            return nums;
        }
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<nums.length;i++ ){
            if(s.size()<2){
                s.push(nums[i]);
            }else{
                int n = (int) s.pop();
                int m = (int) s.pop();
                if(n == nums[i]){
                    s.add(m);
                }else if(m == nums[i]){
                    s.add(n);
                }else{
                    s.add(m);
                    s.add(n);
                }
            }
        }
        Object []sb = s.toArray();
        for( Object st: sb){


        }
        // sample code
        return new int[6];

    }
}
