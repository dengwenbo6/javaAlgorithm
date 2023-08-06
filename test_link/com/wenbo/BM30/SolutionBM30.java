package com.wenbo.BM30;

import com.wenbo.BM27.TreeNode;

import java.util.Stack;

public class SolutionBM30 {

    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null){
            return null;
        }
        Stack<TreeNode> treeNodeStack = new Stack<>();
        TreeNode curNode = pRootOfTree;
        TreeNode result = new TreeNode(-1);
        TreeNode pre = result;
        TreeNode cur_result;
        while (!treeNodeStack.isEmpty() || curNode != null){
            while (curNode!=null){
                treeNodeStack.push(curNode);
                curNode = curNode.left;
            }
            if (!treeNodeStack.isEmpty()){
                // 遍历弹栈节点
                TreeNode pop = treeNodeStack.pop();
                cur_result = new TreeNode(pop.val);
                cur_result.left = pre;
                pre.right = cur_result;
                pre = pre.right;
                curNode = curNode.right;
            }

        }
        result = result.right;
        result.left = null;
        return result;


    }
}
