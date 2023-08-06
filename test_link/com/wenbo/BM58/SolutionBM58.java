package com.wenbo.BM58;

import java.util.*;

public class SolutionBM58 {
    public ArrayList<String> result = new ArrayList<>();
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param str string字符串
     * @return string字符串ArrayList
     */
    public ArrayList<String> Permutation (String str) {
        // write code here
        if (str.isEmpty() || str == null){
            return result;
        }
        char[] chars = str.toCharArray();
        // 堆 记录每一个序列
        Stack<Character> stack = new Stack<>();
        // 记录使用过的标记
        boolean[] used = new boolean[chars.length];
        backTracking(chars,stack,used);
        return result;
    }

    private void backTracking(char[] chars, Stack<Character> stack, boolean[] used) {
        if (stack.size() == chars.length){
            String tempResult = "";
            for (Character character : stack) {
                tempResult += character.toString();
            }
            result.add(tempResult);
            return;
        }
        for (int i = 0;i<chars.length;i++){
            if (used[i] || (i>0 && chars[i]==chars[i-1] && !used[i-1])){
                continue;
            }
            used[i] = true;
            stack.push(chars[i]);
            backTracking(chars,stack,used);
            used[i] = false;
            stack.pop();
        }
    }
}
