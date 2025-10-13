package com.leetcode.array.heap;

import com.leetcode.utils.ListNode;

import java.util.PriorityQueue;

public class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> q = new PriorityQueue<>((l1, l2) -> l1.val - l2.val);
        for (ListNode list: lists) {
            if (list==null) continue;
            q.add(list);
        }

        ListNode ans = new ListNode(0);
        ListNode dummy = ans;
        while (!q.isEmpty()) {
            ListNode curr = q.poll();
            dummy.next = curr;
            if (curr.next != null) {
                q.add(curr.next);
            }
            dummy = dummy.next;
        }
        return ans.next;
    }
}