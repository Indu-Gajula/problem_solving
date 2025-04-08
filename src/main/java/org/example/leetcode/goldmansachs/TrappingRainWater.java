package org.example.leetcode.goldmansachs;

public class TrappingRainWater {

    // bruteforce -  time complexity - O(n^2), space complexity O(1)
    public static int getAmountOfWaterStored(int []buildings){

        int result = 0;
        int n = buildings.length;
        for (int i = 1; i < n-1 ; i++) {

                int left = buildings[i];
                for(int j = 1; j<i; j++){
                    left = Math.max(buildings[j],left);
                }
                int right = buildings[i];
                for (int j = i; j < n ; j++) {
                    right = Math.max(buildings[j], right);
                }

                result += Math.min(left,right) - buildings[i];

        }

        return result;
    }


    //  Time Complexity - O(N), Space Complexity -  O(1)

    public static int getUnitsOfWaterStored(int heights[]){

        int total = 0;
        int l = 0; int r = heights.length-1;
        int lMax = 0; int rMax = 0;

        while(l<r){
            if(heights[l] < heights[r]){
                if(heights[l] > lMax){
                    lMax = heights[l];
                }else{
                    total += lMax-heights[l];
                }
                l++;
            }else{
                if(heights[r] > rMax){
                    rMax = heights[r];
                }else{
                    total += rMax - heights[r];
                }
                r--;
            }
        }

        return total;
    }


    public static int trappedWater(int n[]){
        int len =  n.length;
        int []lMaxArr = new int[len];
        int []rMaxArr = new int[len];
        int lMax = n[0];
        int rMax = n[len-1];
        int result = 0;
        for(int i=0; i<len; i++){
            if(lMax<n[i]){
                lMax = n[i];
            }
            lMaxArr[i] = lMax;
        }
        for(int i=len-1; i>=0; i--){
            if(rMax<n[i]){
                rMax = n[i];
            }
            rMaxArr[i] = rMax;
        }
        for(int i=0; i<len; i++){
            result += ( Math.min(lMaxArr[i],rMaxArr[i]) - n[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getUnitsOfWaterStored(new int[]{1,2,1,3,2,3}));
        System.out.println(getAmountOfWaterStored(new int[]{1,2,1,3,2,3}));
    }
}
