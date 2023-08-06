package com.wenbo.BM56;

import java.util.ArrayList;

import java.util.*;


public class SolutionBM56 {
    public static ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param num int整型一维数组
     * @return int整型ArrayList<ArrayList<>>
     */
    public ArrayList<ArrayList<Integer>> permuteUnique (int[] num) {
        // write code here
        if (num.length == 0) {
            return result;
        }
        Arrays.sort(num);
        // 用于回溯算法
        Stack<Integer> st = new Stack<>();
        // 标识已经使用过的
        boolean[] used = new boolean[num.length];
        backTracking(num, st, used);


        return result;
    }

    private void backTracking(int[] num, Stack<Integer> st, boolean[] used) {
        if (st.size() == num.length) {
            result.add(new ArrayList<>(st));
            return;
        }
        for (int i = 0; i < num.length; i++) {
            if ((i > 0 && (num[i - 1] == num[i]) && !used[i - 1]) ||used[i]) {
                continue;
            }
            used[i] = true;
            st.push(num[i]);
            backTracking(num, st, used);
            // 回溯
            used[i] =  false;
            st.pop();
        }
    }
}
