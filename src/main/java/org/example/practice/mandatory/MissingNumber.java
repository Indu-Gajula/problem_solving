package org.example.practice.mandatory;

import java.util.Arrays;

//leetcode 268
public class MissingNumber {
    // given array [0 TO N]

    //
    public static int findMissingNum(int[] nums){
        int sum = 0 ;
        for(int i=1;i<nums.length; i++){
            sum = sum + (i-nums[i-1]);
        }
        return sum;
    }

    // works for starting from 0
    public static int findMissingNumXOR(int[] nums){
        int sum = 0 ;
        for(int i=1;i<=nums.length; i++){
            sum = sum^(i^nums[i-1]);
        }
        return sum;
    }


    // using // using XOR TODO - CHECK WHY NOT WRKING FOR STARTING FROM 1
    // strting from  [0 N ] IS wrking if initializing nxor = 0, starting i from 1

    public static int findMissingNumberUsingXOR(int[] nums){
        // XOR of N numbers from 1 to n
        int nXor = 1;
        for(int i=2;i<=nums.length;i++){

            nXor = nXor^i;
//            System.out.println(i + " "+ nXor);
        }
        int nnXor = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nnXor = nnXor^nums[i];
//            System.out.println(nums[i] + " "+ nXor);
        }
        return nXor^nnXor;

    }




    // sorting and comparing with index
    public static int find(int[] nums){

        Arrays.sort(nums);
        for(int i=0;i<nums.length; i++){
             if ( i != nums[i]) return i;
        }
        return nums.length;
    }

    // based on n natural number sum
    public static int find1(int[] nums){
        int n = nums.length-1; // starting from 0, len if arr starting from 1
        int exectedSum = (n *(n-1)) / 2;
        int actSum = 0;
        for (int i: nums){
            actSum+=i;
        }
        return exectedSum-actSum;
    }

    // adviced to use when array is already sorted
    // for [0 N]
    // O(n logn)
    //
    public static int findUsingBinarySearch(int[] nums){
        Arrays.sort(nums);
        int l =0;
        int  r = nums.length-1;
        int mid =0;
        while(l<=r){
             mid = l+(r-l)/2;
            if(nums[mid] == mid){
                l = mid+1;
            }else{
                r = mid-1;
            }
        }
        return mid;
    }
    public static int findUsingBinarySearchStartingFrom1(int[] nums){
        Arrays.sort(nums);
        int l =0;
        int  r = nums.length-1;
        int mid =0;
        while(l<=r){
            mid = l+(r-l)/2;
            if(nums[mid] == mid+1){
                l = mid+1;
            }else{
                r = mid-1;
            }
        }
        return mid+1;
    }

    // if array is already sorted
    // O(logn)
    public static int findUsingBinarySearchArrSorted(int[] nums){

        int l =0;
        int  r = nums.length-1;
        int mid =0;
        while(l<=r){
            mid = l+(r-l)/2;
            if(nums[mid] == mid){
                l = mid+1;
            }else{
                r = mid-1;
            }
        }
        return mid;
    }


    public static void main(String[] args) {
        System.out.println(findUsingBinarySearchStartingFrom1(new int[]{1,2,6,5,3}));
//        System.out.println(findMissingNumberUsingXOR(new int[]{1,2,6,5,3}));
        System.out.println(findMissingNumXOR(new int[]{1,2,6,5,3,0}));
    }

}
