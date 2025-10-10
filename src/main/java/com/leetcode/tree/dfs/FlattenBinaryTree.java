package com.leetcode.tree.dfs;
import java.util.*;
import com.leetcode.utils.TreeNode;

public class FlattenBinaryTree {
    TreeNode prev = null;
    public void flatten(TreeNode root) {
        if (root == null) return;
        flatten(root.right);
        flatten(root.left);
        root.right = prev;
        root.left = null;
        prev = root;
    }
}