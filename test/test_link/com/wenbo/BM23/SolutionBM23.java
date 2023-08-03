package com.wenbo.BM23;

import java.util.ArrayList;
import java.util.Stack;
// 先序遍历


public class SolutionBM23 {

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param root TreeNode类
     * @return int整型一维数组
     */
    public int[] preorderTraversal (TreeNode root) {
        // write code here
        Stack<TreeNode> treeNodeStacks = new Stack<>();
        ArrayList<Integer> integers = new ArrayList<>();

        TreeNode curNode = root;
        while (curNode != null || !treeNodeStacks.isEmpty()){
            while (curNode != null){
                integers.add(curNode.val);
                treeNodeStacks.push(curNode);
                curNode = curNode.left;
            }

            if (!treeNodeStacks.isEmpty()){
                TreeNode pop = treeNodeStacks.pop();
                curNode = pop.right;
            }
        }
        int[] result = new int[integers.size()];
        int i = 0;
        for (Integer integer : integers) {
            result[i++] = integer;
        }
        return result;
    }
}
