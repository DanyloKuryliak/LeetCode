package com.leetcode.dp;

public class LongestPalindromeSubseq {
    int[][] memo;
    String str;
    public int longestPalindromeSubseq(String s) {
        this.str = s;
        int n = s.length();
        this.memo = new int[n][n];
        return dp(0, n - 1);
    }

    private int dp(int i, int j) {
        if (memo[i][j] != 0) return memo[i][j];
        if (i > j) return 0;
        if (i == j) return 1;
        if (str.charAt(i) == str.charAt(j)) {
            memo[i][j] = 2 + dp(i+1, j-1);
        } else {
            memo[i][j] = Math.max(dp(i+1, j), dp(i, j-1));
        }
        return memo[i][j];
    }
}

class Solution5 {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];

        for (int i = n - 1; i >= 0; i--) {
            dp[i][i] = 1;
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i+1][j-1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i][j-1], dp[i+1][j]);
                }
            }
        }
        return dp[0][n-1];
    }
}