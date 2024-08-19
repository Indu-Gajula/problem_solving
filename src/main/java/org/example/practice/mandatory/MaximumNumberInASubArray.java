package org.example.practice.mandatory;

import org.example.utility.Utility;

import java.util.ArrayDeque;
import java.util.Queue;

public class MaximumNumberInASubArray {


    //
    // dequeue - 1,2,3,4,5, subraay size 3,
    // add in queue - 3 elements
    //1,5,3,2,4

    public static int[] findMaxInSubArrs(int[] nums, int subArrSize){

        int n = nums.length;
        int[] result = new int[n-subArrSize+1];
        Queue<Integer> q = new ArrayDeque<>();
        for(int i=0; i<=n-subArrSize;i++) {
            int k = 0;
            while (k < subArrSize) {

                if (!q.isEmpty() && i + k - q.peek() >= subArrSize) {
                    q.poll();
                }
                if (!q.isEmpty() && q.peek() < nums[i + k]) {
                    q.poll();
                    q.offer(i + k);
                } else {
                    q.offer(i + k);
                }


                k++;
            }

            result[i] = nums[q.peek()];
        }
        return result;
    }

    public static void main(String[] args) {
        Utility.printArray(findMaxInSubArrs(new int[]{1,5,3,2,4},3));
    }

}
