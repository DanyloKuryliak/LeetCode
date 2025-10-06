package com.leetcode.tree.binarytree;
import com.leetcode.utils.TreeNode;
import com.leetcode.utils.ListNode;
import java.util.*;

public class UniqueBinaryTrees {
    public int numTrees(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i  = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] += dp[j-1] * dp[i-j];
            }
        }
        return dp[n];
    }
}