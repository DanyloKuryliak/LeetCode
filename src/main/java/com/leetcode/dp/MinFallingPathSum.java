package com.leetcode.dp;

import java.util.Arrays;

public class MinFallingPathSum {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;

        int[] prev = Arrays.copyOf(matrix[0], n);
        for (int i = 1; i < n; i++) {
            int[] curr = new int[n];
            for (int j = 0; j < n; j++) {
                int minPrev = prev[j];
                if (j>0) minPrev = Math.min(minPrev, prev[j-1]);
                if (j<n-1) minPrev = Math.min(minPrev, prev[j+1]);
                curr[j] = matrix[i][j] + minPrev;
            }
            prev = curr;
        }

        int res = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            res = Math.min(res, prev[i]);
        }
        return res;
    }
}