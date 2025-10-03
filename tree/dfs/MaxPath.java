package tree.dfs;
import utils.TreeNode;
import java.util.*;
public class MaxPath {
    public int maxPathSum(TreeNode root) {
        int[] res = {root.val};
        dfs(root, res);
        return res[0];
    }

    private int dfs(TreeNode node, int[] res) {
        if (node == null) return 0;
        int leftSum = Math.max(0, dfs(node.left, res));
        int rightSum = Math.max(0, dfs(node.right, res));
        res[0] = Math.max(res[0], leftSum + rightSum + node.val);
        return Math.max(leftSum, rightSum) + node.val;
    }
}