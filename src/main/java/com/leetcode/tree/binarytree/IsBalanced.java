package com.leetcode.tree.binarytree;
import com.leetcode.utils.TreeNode;

public class IsBalanced {
    public boolean isBalanced(TreeNode root) {
        int[] res = dfs(root);
        return res[0] == 1;
    }

    private int[] dfs(TreeNode node) {
        if (node == null) return new int[]{1,0};

        int[] left = dfs(node.left);
        int[] right = dfs(node.right);

        boolean balanced = (left[0] == 1 && right[0] == 1 && Math.abs(left[1]-right[1]) <= 1);

        return new int[]{balanced ? 1 : 0, 1 + Math.max(left[1], right[1])};

    }
}