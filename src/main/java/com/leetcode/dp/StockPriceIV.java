package com.leetcode.dp;

public class StockPriceIV {
    private int[] prices;
    private int[][][] memo;

    public int maxProfit(int k, int[] prices) {
        this.prices = prices;
        this.memo = new int[prices.length][k+1][2];
        return dp(0, k, 0);

    }

    private int dp(int i, int k, int holding) {
        if (i == prices.length || k == 0) return 0;

        if (memo[i][k][holding] == 0) {
            int doNothing = dp(i+1, k, holding);
            int doSomething;

            if (holding == 1) {
                doSomething = prices[i] + dp(i+1, k - 1, 0);
            } else {
                doSomething = -prices[i] + dp(i+1, k , 1);
            }
            memo[i][k][holding] = Math.max(doSomething, doNothing);
        }

        return memo[i][k][holding];
    }
}