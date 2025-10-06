package com.leetcode.tree.bfs;
import com.leetcode.utils.TreeNode;
import java.util.*;

public class ZigZagTraversal {
    
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            int n = q.size();
            for (int i = 0; i < n; i++) {
                TreeNode node = q.poll();
                if (node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }
                list.add(node.val);
            }
            res.add(list);
        }

        for (int i = 1; i < res.size(); i+= 2) {
            List<Integer> list = res.get(i);
            Collections.reverse(list);
            res.set(i, list);
        }

        return res;
    }
}