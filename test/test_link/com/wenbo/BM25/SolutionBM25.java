package com.wenbo.BM25;

import com.wenbo.BM23.TreeNode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 后序遍历
 */
public class SolutionBM25 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param root TreeNode类
     * @return int整型一维数组
     */
    public int[] postorderTraversal (TreeNode root) {
        // write code here
        if (root == null){
            return new int[0];
        }
        Stack<TreeNode> treeNodeStack = new Stack<>();
        ArrayList<Integer> integers = new ArrayList<>();

        TreeNode curNode = root;
        TreeNode pre =null;
        while (curNode != null || !treeNodeStack.isEmpty()){
            while (curNode != null){
                treeNodeStack.push(curNode);
                curNode = curNode.left;
            }
            curNode = treeNodeStack.peek();
            if (curNode.right != null && pre != curNode.right){
                curNode = curNode.right;
            }else {
                TreeNode pop = treeNodeStack.pop();
                integers.add(pop.val);
                pre = curNode;
                curNode = null;
            }
        }
        int[] result = new int[integers.size()];
        int i= 0;
        for (Integer integer : integers) {
            result[i++] = integer;
        }
        return result;

    }
}
