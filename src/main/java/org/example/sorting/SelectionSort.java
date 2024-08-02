package org.example.sorting;

public class SelectionSort {




    /*
    * placing the minimum at bigining indexes, by holding the
    * minimum value's index in a variable and swapping when an array interation is completed
    */
    public static int[] sort(int[] nums){

        int len = nums.length;
        int minInd;
        for(int i=0; i<len-1; i++){
            minInd = i;
            for(int j=i+1;j<len;j++){
                if(nums[j] < nums[minInd]){
                    minInd = j;
                }
            }
            if(minInd != i) swap(nums,minInd,i);
        }

        return nums;
    }

    public static void swap(int[] nums, int index1, int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
