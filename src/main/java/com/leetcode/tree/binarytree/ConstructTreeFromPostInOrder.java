package com.leetcode.tree.binarytree;

import com.leetcode.utils.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class ConstructTreeFromPostInOrder {
    private int index;
    private Map<Integer, Integer> map;

    public TreeNode buildTree(int[] inorder, int[] postorder) {

        map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        index = postorder.length - 1;
        return build(postorder, 0, inorder.length - 1);
    }

    private TreeNode build(int[] preorder, int start, int end) {
        if (start > end) return null;

        int rootVal = preorder[index--];
        TreeNode root = new TreeNode(rootVal);
        int mid = map.get(rootVal);

        root.right = build(preorder, mid + 1, end);
        root.left = build(preorder, start, mid - 1);

        return root;
    }
}