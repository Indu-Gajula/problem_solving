package org.example.datastructures.impl.mystack;

import java.util.*;

public class MyMonotonicStack {

    // input - {3, 1, 4, 1, 5, 9, 2, 6} , output : 1 1 2 6
    public static int[] monotonicIncreasing(int[] nums) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (int num : nums) {

            while (!stack.isEmpty() && stack.peekLast() > num) {

                stack.pollLast();
            }

            stack.offerLast(num);
        }

        int[] result = new int[stack.size()];
        int index = stack.size() - 1;
        while (!stack.isEmpty()) {
            result[index--] = stack.pollLast();
        }

        return result;
    }

    // 3, 1, 4, 1, 5, 9, 2, 6  output : -1 3 -1 4 -1 -1 9 9
    public static List<Integer> monotonicDecreasing(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        List<Integer> result = new ArrayList<>();


        for (int num : nums) {

            while (!stack.isEmpty() && stack.peek() < num) {
                stack.pop();
            }

            if (!stack.isEmpty()) {
                result.add(stack.peek());
            } else {
                result.add(-1);
            }

            stack.push(num);
        }

        return result;
    }



    public static int[] findNextGreatElement(int []arr){

        int ans[] = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        for (int i=0; i< arr.length; i++){
            int next = arr[i];
            while(!stack.isEmpty() && arr[stack.peek()] > next ){
                ans[stack.pop()] = next;
            }
            stack.push(i);
        }
        while(!stack.isEmpty()){
            ans[stack.pop()] = -1;
        }
        int k = 90;
       HashMap<Integer, Integer> hs = new HashMap<>();
       hs.put(1,k);

        return ans;

    }

    public static int[] findNextSmallerElement(int []arr){
        int ans[] = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        for (int i=0; i< arr.length; i++){
            int next = arr[i];
            while(!stack.isEmpty() && arr[stack.peek()] < next ){
                ans[stack.pop()] = next;
            }
            stack.push(i);
        }
        while(!stack.isEmpty()){
            ans[stack.pop()] = -1;
        }
        return ans;

    }


}
