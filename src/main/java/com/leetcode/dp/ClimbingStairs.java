package com.leetcode.dp;

import java.util.HashMap;

public class ClimbingStairs {
    private HashMap<Integer, Integer> memo = new HashMap<>();

    public int climbStairs(int n) {
        return dp(n);
    }

    private int dp(int i) {
        if (i<= 2) return i;
        if (!memo.containsKey(i)) memo.put(i, dp(i-1) + dp(i-2));
        return memo.get(i);
    }
}

class Solution {
    public int climbStairs(int n) {
        if (n==1) return 1;

        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }

}