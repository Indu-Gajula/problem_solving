package org.example.practice;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    static int findNthFibo(int n){
        int[] arr = new int[n];
        arr[0] = 0;
        arr[1] = 1;
        for(int i=2;i<n;i++){
            arr[i] = arr[i-1]+arr[i-2];
        }
        return arr[n-1];
    }

    static int findNthFiboNum(int n){
        int num = 0;
        int first = 0;
        int second = 1;
        for(int i=2;i<n;i++){
            num = second + first;
            first = second;
            second = num;
        }
        return num;
    }

   static int fibo(int n){
        if(n==1){
            return 0;
        }
        if(n==2){
            return 1;
        }

        return fibo(n-2)+fibo(n-1);
    }

    private static Map<Integer, Long> memo = new HashMap<>();

    public static long fibonacciUsingMemoization(int n) {
        // Base cases
        if (n == 0) return 0;
        if (n == 1) return 1;

        // Check if the value is already computed
        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        // Compute the Fibonacci number and store it in the map
        long result = fibonacciUsingMemoization(n - 1) + fibonacciUsingMemoization(n - 2);
        memo.put(n, result);

        return result;
    }

    public static void main(String[] args) {
        System.out.println(findNthFibo(6));
        System.out.println(findNthFiboNum(6));
        System.out.println(fibo(6));

    }

}
