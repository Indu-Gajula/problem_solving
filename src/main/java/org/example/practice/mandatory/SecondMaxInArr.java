package org.example.practice.mandatory;

public class SecondMaxInArr {
    public static  int findSecondMax(int[] nums){
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int num : nums){
            if(num > firstMax){
                secondMax = firstMax;
                firstMax = num;
            }else if(secondMax < num && num != firstMax){
                secondMax = num;
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {
        System.out.println(findSecondMax(new int[]{1,2,6,7,78,34}));
    }
}
