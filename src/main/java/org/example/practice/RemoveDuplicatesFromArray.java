package org.example.practice;

import org.example.utility.Utility;

import java.util.HashSet;

public class RemoveDuplicatesFromArray {



    public static int[] giveOnlyNonDuplicateElements(int[] nums){

        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            if(!hs.add(nums[i])){
                hs2.add(nums[i]);
            }
        }
        int i=0;
        for(Integer num : hs){
            if(!hs2.contains(num)){
                nums[i] = num;
                i++;
            }
        }

        while(i<nums.length){
            nums[i] = 0;
            i++;
        }
        return nums;

    }
    private static int[] removeDuplicateElements(int[] nums) {

        HashSet<Integer> hs = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            hs.add(nums[i]);
        }
        int i=0;
        for(Integer num : hs){
                nums[i] = num;
                i++;
        }
        while(i<nums.length){
            nums[i] = 0;
            i++;
        }
        return nums;


    }

    private static int[] removeDuplicateElementsWithNewArray(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            hs.add(nums[i]);
        }
        int[] newArr = new int[hs.size()];
        int i=0;
        for(Integer num : hs){
            newArr[i] = num;
            i++;
        }

        return newArr;


    }

    public static void main(String[] args) {
        Utility.printArray(giveOnlyNonDuplicateElements(new int[]{1,2,1,2,2,3,4,5,6,7}));
        Utility.printArray(removeDuplicateElements(new int[]{1,2,1,2,2,3,4,5,6,7}));
        Utility.printArray(removeDuplicateElementsWithNewArray(new int[]{1,2,1,2,2,3,4,5,6,7}));
    }




}
