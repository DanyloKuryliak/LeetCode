package com.leetcode.tree.binarytree;

import com.leetcode.utils.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class ConstructTreeFromPreInOrders {
    private int index;
    private Map<Integer, Integer> map;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        index = 0;
        return build(preorder, 0, inorder.length - 1);
    }
    private TreeNode build(int[] preorder, int start, int end) {
        if (start > end) return null;

        int rootVal = preorder[index++];
        TreeNode root = new TreeNode(rootVal);
        int mid = map.get(rootVal);

        root.left = build(preorder, start, mid - 1);
        root.right = build(preorder, mid + 1, end);

        return root;
    }
}