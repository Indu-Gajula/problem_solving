package org.example.practice;

import java.util.stream.Stream;

import static org.example.utility.Utility.printArray;

public class RemoveEvenIntegersFromArray {


    public static int[] removeEvenElementsFromArray(int []nums){
        int index =0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]%2 == 0){
                continue;
            }
            nums[index] = nums[i];
            index++;
        }
        for (int i = index; i < nums.length ; i++) {
            nums[i] = 0;
        }

        return nums;
    }




    public static void reverseArray(int[] arr){
        int l =0;
        int r = arr.length-1;
        while(l<r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] =  temp;
            l++;
            r--;
        }
        printArray(arr);
    }

}
