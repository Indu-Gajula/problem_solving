package org.example.sorting;

public class MergeSort {
    public static void sort(int[] nums, int low, int high){

        if(low == high) return;
        int mid = low + (high - low)/2 ;

        sort(nums,low,mid);
        sort(nums,mid+1,high);

        mergeArrays(nums,low, high, mid);


    }

    public static void mergeArrays(int []nums, int low, int high, int mid){

        // find size of temp arrays
        int lSize = mid-low+1;
        int rSize = high-mid;

        // create 2 temp arrays with calculated lengths
        int []left = new int[lSize];
        int []right = new int[rSize];

        // add elements into temp array from original array

        for(int i=0; i< lSize; i++){
           left[i] = nums[low+i];
        }
        for(int i=0; i< rSize; i++){
            right[i] = nums[mid+1+i];
        }

        // add elements in sprted order using comparision
        int i = 0;
        int j = 0;
        int k = low;
        while(i < lSize && j < rSize){
            if(left[i] <= right[j]){
                nums[k] = left[i];
                i++;
            }else{
                nums[k] = right[j];
                j++;
            }
            k++;
        }
        while(i<lSize){
            nums[k] = left[i];
            i++;
            k++;
        }

        while(j<rSize){
            nums[k] = right[j];
            j++;
            k++;
        }


    }
}
