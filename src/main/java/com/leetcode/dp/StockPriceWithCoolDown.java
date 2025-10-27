package com.leetcode.dp;

public class StockPriceWithCoolDown {
    private int[] prices;
    private int[][][] memo;
    public int maxProfit(int[] prices) {
        this.prices = prices;
        this.memo = new int[prices.length][2][2];
        return dp(0, 0, 0);
    }

    private int dp(int i, int holding, int cooldown) {
        if (i == prices.length) return 0;


        if (memo[i][holding][cooldown] != 0) return memo[i][holding][cooldown];

        int res = 0;
        if (holding == 1) {
            res = Math.max(dp(i+1, 1, 0), prices[i] + dp(i+1, 0, 1));
        } else if (cooldown == 1) {
            res = dp(i+1, 0, 0);
        } else if (holding == 0) {
            res = Math.max(dp(i+1, 0, 0), -prices[i] + dp(i+1, 1, 0));
        }

        return memo[i][holding][cooldown] = res;
    }
}