package src;

import com.wenbo.BM4.ListNode;
import com.wenbo.BM4.SolutionBM4;
import com.wenbo.BM7.SolutionBM7;

import java.util.ArrayList;
import java.util.Scanner;

public class BM7Test {
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
        cur2.next = list2.next;
        cur1.next = list2.next;

        print(list1.next);
        ListNode listNode = new SolutionBM7().EntryNodeOfLoop(list1.next);
        print(listNode);
        System.out.println("Hello world!");

    }

    public static void print(ListNode listNode){
        ArrayList<Integer> integers = new ArrayList<>();
        int k =0;
        while (listNode!=null&& k++<6){
            integers.add(listNode.val);
            listNode = listNode.next;
        }
        System.out.println(integers.toString());
    }
}
