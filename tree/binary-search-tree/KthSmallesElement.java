package tree.binarysearchtree;
import utils.TreeNode;
import utils.ListNode;

import java.util.*;

public class KthSmallesElement {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> arr = inorder(root, new ArrayList<Integer>());
        return arr.get(k-1);
    }

    private List<Integer> inorder(TreeNode root, List<Integer> arr) {
        if (root == null) return arr;
        inorder(root.left, arr);
        arr.add(root.val);
        inorder(root.right, arr);
        return arr;
    }
}