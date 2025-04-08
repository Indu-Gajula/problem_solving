package org.example.leetcode.goldmansachs;

import org.apache.tomcat.util.net.jsse.JSSEUtil;

public class StairCase {

    // n- final step TC -- O(n), SC O(1)
    public static int howManyDifferentWaysCanULandFinalStep(int n){
        int one = 1;
        int two = 1;
        for(int i = 0; i< n-1; i++){
            int temp = one;
            one = one + two;
            two = temp;
        }
        return one;
    }
    // different approach - DP -- -- both tc and sc is O(n)
    public static int noOfStepsToLandFinalStep(int n){
        if(n == 1){
            return 1;
        }
        int []dp = new int[n+1];
        dp[n] = 1;
        dp[n-1] = 1;
        int i;
        for(i = n-2; i>=0; i--){
            dp[i] = dp[i+1]+dp[i+2];
        }
        return dp[i+1];

//        if (n == 1) {
//            return 1;
//        }
//        int[] dp = new int[n + 1];
//        dp[1] = 1;
//        dp[2] = 2;
//        for (int i = 3; i <= n; i++) {
//            dp[i] = dp[i - 1] + dp[i - 2];
//        }
//        return dp[n];
    }


    // recursion   --- O(2^n) in TC, O(n) -- SC
    public static int claimbStairs(int n){
        return claimbStairs(0,n);
    }
    public static int claimbStairs(int i, int n){
        if(i == n){
          return 1;
        }
        if(i > n){
          return 0;
        }
        return claimbStairs(i+1, n) + claimbStairs(i+2,n);
    }

    // recursion - memoisation / caching  -- both tc and sc is O(n)

    public static int claimbStairsWithCache(int n){
        return claimbStairs(0,n, new int[n+1]);
    }
    public static int claimbStairs(int i, int n, int []memo){
        if(i == n){
            return 1;
        }
        if(i > n){
            return 0;
        }
        if(memo[i] > 0){
           return memo[i];
        }
        memo[i] = claimbStairs(i+1, n, memo) + claimbStairs(i+2,n, memo);
        return memo[i];
    }



    public static void main(String[] args) {
        System.out.println(howManyDifferentWaysCanULandFinalStep(5)); // should be 8
        System.out.println(claimbStairs(6)); // 13
        System.out.println(claimbStairsWithCache(6)); //13
        System.out.println(noOfStepsToLandFinalStep(6));
    }
}
