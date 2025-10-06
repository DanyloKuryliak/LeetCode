package com.leetcode.tree.dfs;
import com.leetcode.utils.TreeNode;
import com.leetcode.utils.ListNode;
import java.util.*;


public class MinDepth {
    
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> q = new LinkedList<>() {};
        q.offer(root);
        int depth = 1;

        while (!q.isEmpty()) {
            int levelSize = q.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = q.poll();
                if (node.left == null && node.right == null) {
                    return depth;
                }
                if (node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }
            }
            depth++;
        }
        return depth;
}
}