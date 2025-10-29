package com.leetcode.dp;

public class CircularKadane {
    public int maxSubarraySumCircular(int[] nums) {
        int currentBest = 0;
        int currentWorst = 0;
        int best = Integer.MIN_VALUE;
        int worst = Integer.MAX_VALUE;
        int total = 0;

        for (int n : nums) {
            total += n;
            currentBest = Math.max(currentBest + n, n);
            currentWorst = Math.min(currentWorst + n, n);
            best = Math.max(best,currentBest);
            worst = Math.min(worst, currentWorst);
        }
        if (best < 0) {
            return best;
        }
        return Math.max(best, total - worst);
    }
}