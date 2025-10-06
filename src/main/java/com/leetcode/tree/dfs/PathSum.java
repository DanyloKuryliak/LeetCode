package com.leetcode.tree.dfs;
import java.util.ArrayList;
import com.leetcode.utils.TreeNode;
import com.leetcode.utils.ListNode;
import java.util.List;

public class PathSum {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(root, targetSum, new ArrayList<>(), 0, res);
        return res;
    }

    private void dfs(TreeNode node, int targetSum,  List<Integer> currentPath, int currentSum, List<List<Integer>> res) {
        if (node == null) return;

        currentSum += node.val;
        currentPath.add(node.val);

        if (node.left == null && node.right == null && currentSum == targetSum) {
            res.add(new ArrayList<>(currentPath));
        }

        dfs(node.left, targetSum, currentPath, currentSum, res);
        dfs(node.right, targetSum, currentPath, currentSum, res);

        currentPath.remove(currentPath.size()-1);
    }
}