package com.leetcode.dp;

public class MinCostClimbing {
    public int minCostClimbingStairs(int[] cost) {
        int[] minimumCost = new int[cost.length + 1];

        for (int i = 2; i < cost.length + 1; i++) {
            int takeOne = minimumCost[i-1] + cost[i-1];
            int takeTwo = minimumCost[i-2] + cost[i-2];
            minimumCost[i] = Math.min(takeOne, takeTwo);
        }
        return minimumCost[minimumCost.length-1];
    }
}

