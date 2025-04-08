package org.example.leetcode.goldmansachs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class KthLargestElement {

    //using priorityQueue
    public static int findKthLargestElement(int[] num, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>(k);
        for(int i : num){
            pq.add(i);
            if(pq.size() > k){
                pq.poll();
            }
        }
        return pq.peek().intValue();
    }

    public static int findKthSmallestElement(int[] num, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>(k,Comparator.reverseOrder());
        for(int i : num){
            pq.add(i);
            if(pq.size() > k){
                pq.poll();
            }
        }
        return pq.peek().intValue();
    }
 // sorting
    public static int findKthLargestElementUsingSort(int[] num, int k){
        Arrays.sort(num);
        return num[num.length-k];
    }

    public static int findKthLargest(int[] nums, int k) {
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;

        for (int num: nums) {
            minValue = Math.min(minValue, num);
            maxValue = Math.max(maxValue, num);
        }

        int[] count = new int[maxValue - minValue + 1];
        for (int num: nums) {
            count[num - minValue]++;
        }

        int remain = k;
        for (int num = count.length - 1; num >= 0; num--) {
            remain -= count[num];
            if (remain <= 0) {
                return num + minValue;
            }
        }

        return -1;
    }


    public static int findKthSmallest(int[] nums, int k) {
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;

        for (int num: nums) {
            minValue = Math.min(minValue, num);
            maxValue = Math.max(maxValue, num);
        }

        int[] count = new int[maxValue - minValue + 1];
        for (int num: nums) {
            count[num - minValue]++;
        }

        int remain = k;
        for (int num = 0; num <= count.length - 1; num++) {
            remain -= count[num];
            if (remain <= 0) {
                return num + minValue;
            }
        }

        return -1;
    }

    int getSecondSmallest(int []arr){

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for(int value: arr){
            if(value < smallest ){
                secondSmallest = smallest;
                smallest = value;
            } else if (value != smallest && value < secondSmallest) {
                secondSmallest = value;
            }
        }
        return secondSmallest;
    }


    public static void main(String[] args) {
        System.out.println(findKthLargestElement(new int[]{1,2,3,4,5,5},4));
        System.out.println(findKthSmallestElement(new int[]{1,2,3,4,5,5},4));
        System.out.println(findKthLargest(new int[]{1,2,3,4,5,5},4));
        System.out.println(findKthSmallest(new int[]{1,2,3,4,5,5},4));

    }






}
