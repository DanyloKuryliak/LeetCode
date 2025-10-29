package com.leetcode.dp;

import java.util.Arrays;

public class CoinChange2 {
    int[][] memo;
    int[] coins;

    public int change(int amount, int[] coins) {
        this.coins = coins;
        memo = new int[coins.length][amount+1];

        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }

        return dp(0, amount);
    }

    private int dp(int i, int amount) {
        if (amount == 0) return 1;
        if (i==coins.length) return 0;

        if (memo[i][amount] != -1) {
            return memo[i][amount];
        }

        if (coins[i] > amount) {
            return dp(i + 1, amount);
        }

        memo[i][amount] = dp(i, amount - coins[i]) + dp(i + 1, amount);
        return memo[i][amount];
    }
}