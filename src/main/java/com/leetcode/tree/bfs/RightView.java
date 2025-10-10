package com.leetcode.tree.bfs;
import java.util.*;
import com.leetcode.utils.TreeNode;

public class RightView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();

                if (i == 0) result.add(node.val);
                if (node.right != null) queue.add(node.right);
                if (node.left != null) queue.add(node.left);
            }
        }

        return result;
    }

}