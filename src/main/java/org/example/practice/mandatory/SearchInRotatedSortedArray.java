package org.example.practice.mandatory;

public class SearchInRotatedSortedArray {

    public static int findElementInRotatedSortedArray(int[] nums, int target){
        int len =nums.length;
        int l = 0;
        int r = len-1;
        int k = 0 ;
        while( l<=r){
            int mid = l+(r-l)/2;
            if(nums[mid] <= nums[0] ){
                k = mid;
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        if(nums[0] > target)
            return binarySearch(nums,k,len,target);
        else
            return binarySearch(nums,0,k-1,target);

    }

    public static int binarySearch(int[] nums, int l, int r, int target){
        while(l<=r){
            int mid = l+(r-l)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                r = mid;
            }else{
                l = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(findElementInRotatedSortedArray(new int[]{4,5,6,7,0,1,2,3},9));
    }



}

