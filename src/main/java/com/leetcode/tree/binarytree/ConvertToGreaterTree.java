package com.leetcode.tree.binarytree;
import com.leetcode.utils.TreeNode;
import com.leetcode.utils.ListNode;
import java.util.*;


public class ConvertToGreaterTree {
    int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        traverse(root);
        return root;
    }

    private void traverse(TreeNode node) {
        if (node == null) return;
        traverse(node.right);
        sum += node.val;
        node.val = sum;
        traverse(node.left);
    }
}