package com.leetcode.tree.dfs;
import com.leetcode.utils.TreeNode;

public class MaxDepth {
    public int maxDepth(TreeNode root) {
        return helper(root, 0);
    }

    private int helper(TreeNode root, int depth) {
        if (root == null) return depth;
        int left = helper(root.left, depth + 1);
        int right = helper(root.right, depth + 1);
        return Math.max(left, right);
    }
}