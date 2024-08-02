package org.example.sorting;



public class BubbleSort  {
    public static int[] sort(int[] nums){

        // place the max element at the end bhy comparing adjucent elements,
        // at the end of array -> elements will be sorted need not to consider these
        // if there are no swaps happening in one cycle, that means array is already sorted
        //

        int length = nums.length;
        for(int i=0; i<length-1; i++){
            boolean swap = false;
            for(int j=0; j<length-i-1; j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    swap = true;
                }
            }
            if(!swap) break;
        }

        return nums;
    }

}
