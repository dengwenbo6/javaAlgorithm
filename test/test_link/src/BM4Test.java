package src;

import com.wenbo.BM4.ListNode;
import com.wenbo.BM4.SolutionBM4;

import java.util.ArrayList;
import java.util.Scanner;

public class BM4Test {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(-1);
        ListNode list2 = new ListNode(-1);
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入list1的值：");
        int i1 = scanner.nextInt();
        ListNode cur1 =list1;
        while (i1>0){
            cur1.next = new ListNode(i1);
            cur1 = cur1.next;
            i1 = scanner.nextInt();
        }

        System.out.println("输入list2的值：");
        int i2 = scanner.nextInt();
        ListNode cur2 = list2;
        while (i2>0){
            cur2.next = new ListNode(i2);
            cur2 = cur2.next;
            i2 = scanner.nextInt();
        }

        ListNode listNode = new SolutionBM4().Merge(list1.next, list2.next);
        ArrayList<Integer> integers = new ArrayList<>();
        while (listNode!=null){
            integers.add(listNode.val);
            listNode = listNode.next;
        }
        System.out.println(integers.toString());
        System.out.println("Hello world!");

    }

}