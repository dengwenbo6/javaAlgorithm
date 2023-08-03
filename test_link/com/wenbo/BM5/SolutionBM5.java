package com.wenbo.BM5;

import com.wenbo.BM4.ListNode;

import java.util.ArrayList;

public class SolutionBM5 {
    public ListNode mergeKLists(ArrayList<ListNode> lists) {
        return digui(lists,0,lists.size()-1);
    }
    public ListNode digui(ArrayList<ListNode> lists, int left, int right) {
        if (left > right)
            return null;
        else if (left == right)
            return lists.get(left);
        else {
            int mid = (left + right) / 2;

            return mergeTwo(digui(lists, left, mid), digui(lists, mid + 1, right));
        }

    }

    public ListNode mergeTwo(ListNode list1, ListNode list2) {
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;

        ListNode res = new ListNode(0);
        ListNode cur = res;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                cur.next = list1;
                list1 = list1.next;
            } else {
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }

        if (list1 != null)
            cur.next = list1;
        if (list2 != null)
            cur.next = list2;

        return res.next;
    }
}
