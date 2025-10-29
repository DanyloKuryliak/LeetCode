package com.leetcode.dp;

public class PaintFence {
    public int numWays(int n, int k) {
        if (n==1) return k;
        if (n==2) return k*k;

        int[] dp = new int[n];
        dp[0] = k;
        dp[1] = k*k;
        for (int i = 2; i < dp.length; i++) {
            dp[i] = (k - 1) * (dp[i-1] + dp[i-2]);
        }
        return dp[dp.length-1];
    }
}