package org.example.practice.mandatory;

import org.example.utility.Utility;

public class ProductOfArray {

    //with division - O(N)
    public static int[] productOfArrayExceptItself(int[] nums){
        int len = nums.length;
        int prod = 1;
        for(int i = 1 ; i<len; i++){
            prod *= nums[i];
        }
        for(int i = 0 ; i<len; i++){
            nums[i] = prod/nums[i];
        }
        return nums;
    }
    //without division and O(N) time complexity
    public static int[] productOfArrayExceptItselfWithoutDivsion(int[] nums){
        int len = nums.length;
        int[] prefixProd = new int[len];
        int[] suffixProd = new int[len];
        prefixProd[0] = suffixProd[len-1]= 1;
        for(int i = 1 ; i<len; i++){
            prefixProd[i] = prefixProd[i-1] * nums[i-1] ;
        }
        for(int j = len-2 ; j>=0; j--){
            suffixProd[j] = suffixProd[j+1] * nums[j+1] ;
        }
        for(int i = 0 ; i<len; i++){
            nums[i] = prefixProd[i]*suffixProd[i];
        }
        return nums;
    }

    public static void main(String[] args) {
        Utility.printArray(productOfArrayExceptItself(new int[]{1,2,3,4,5,6}));
        Utility.printArray(productOfArrayExceptItselfWithoutDivsion(new int[]{1,2,3,4,5,6}));
    }
}
