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