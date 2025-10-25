package com.leetcode.dp;

import java.util.HashMap;

public class DeleteAndEarn {
    public int deleteAndEarn(int[] nums) {
        HashMap<Integer, Integer> points = new HashMap<>();
        int maxNumber = 0;

        for (int n: nums) {
            points.put(n, points.getOrDefault(n, 0) + n);
            maxNumber = Math.max(maxNumber, n);
        }

        int[] dp = new int[maxNumber+1];
        dp[1] = points.getOrDefault(1, 0);

        for (int i = 2; i < dp.length; i++) {
            int gain = points.getOrDefault(i, 0);
            dp[i] = Math.max(gain + dp[i-2], dp[i-1]);
        }
        return dp[dp.length - 1];
    }
}