package tree.binarysearchtree;
import utils.TreeNode;
import utils.ListNode;

public class SortedLinkedListToBST {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return new TreeNode(head.val);

        ListNode slow = head, fast = head, slow_previous = null;
        while (fast != null && fast.next != null) {
            slow_previous = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        TreeNode root = new TreeNode(slow.val); //middle
        slow_previous.next = null;
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(slow.next);
        return root;

    }
}