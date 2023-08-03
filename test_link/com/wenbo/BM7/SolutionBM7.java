package com.wenbo.BM7;

import com.wenbo.BM4.ListNode;

public class SolutionBM7 {
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if (pHead == null || pHead.next == null) return null;
        ListNode fast = pHead;
        ListNode slow = pHead;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            // 快慢相遇，说明成环
            if (fast == slow) {
                ListNode tmp = pHead;
                while (tmp != slow) {
                    tmp = tmp.next;
                    slow = slow.next;
                }
                return tmp;
            }
        }
        return null;
    }
}
