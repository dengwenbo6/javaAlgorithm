package com.wenbo.BM4;

public class SolutionBM4 {
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode list3=new ListNode(-1);
        ListNode cur = list3;
        while(list1 != null && list2 != null){
            if(list1.val<list2.val){
                ListNode listTemp = new ListNode(list1.val);
                cur.next = listTemp;
                cur = cur.next;
                list1 = list1.next;
            }else{
                ListNode listTemp = new ListNode(list2.val);
                cur.next = listTemp;
                cur = cur.next;
                list2 = list2.next;
            }
        }
        if(list1 == null){
            cur.next = list2;
        }else{
            cur.next = list1;
        }
        return list3.next;

    }
}
