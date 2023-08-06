package com.wenbo.BM42;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Stack;

public class SolutionBM42 {

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    ArrayList<Integer> list1 = new ArrayList<Integer>();

    public void push(int node) {
        stack1.push(node);

        list1.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1.equals(02)){
                    return 0;
                }else if (o1>o2){
                    return 1;
                }else {
                    return -1;
                }
            }
        });

    }

    public int pop() {
        if (stack2.size() <= 0) {
            for (int i = 0; i < stack1.size(); i++) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
