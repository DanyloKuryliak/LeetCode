package com.leetcode.tree.binarytree;
import com.leetcode.utils.TreeNode;
import com.leetcode.utils.ListNode;
import java.util.*;
public class TreePruning {
    
    public TreeNode pruneTree(TreeNode root) {
        if (root == null) return null;

        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);

        if (root.left == null && root.right == null && root.val == 0) {
            return null;
        } else {
            return root;
        }
    }
}