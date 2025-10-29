package com.leetcode.dp;

public class BestTimetoBuyandSellStock1 {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int best = 0;
        for (int n : prices) {
            if (n < minPrice) minPrice = n;
            else if (n - minPrice > best) best = n - minPrice;
        }
        return best;
    }
}