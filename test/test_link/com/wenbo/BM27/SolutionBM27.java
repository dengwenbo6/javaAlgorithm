package com.wenbo.BM27;

import com.wenbo.BM23.TreeNode;

import java.util.ArrayList;
import java.util.Stack;

public class SolutionBM27 {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        if (pRoot == null){
            return new ArrayList<ArrayList<Integer>>();
        }
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int depth = 1;
        Stack<TreeNode> treeNodeStack1 = new Stack<>();
        Stack<TreeNode> treeNodeStack2 = new Stack<>();
        treeNodeStack1.push(pRoot);
        while (!treeNodeStack1.isEmpty() || !treeNodeStack2.isEmpty()){
            ArrayList<Integer> integers = new ArrayList<>();
            if (depth % 2 == 1){
                while (!treeNodeStack1.isEmpty()){
                    TreeNode pop = treeNodeStack1.pop();
                    integers.add(pop.val);
                    if (pop.left!=null) treeNodeStack2.push(pop.left);
                    if (pop.right != null) treeNodeStack2.push(pop.right);
                }
            }else {
                while (!treeNodeStack2.isEmpty()){
                    TreeNode pop = treeNodeStack2.pop();
                    integers.add(pop.val);
                    if (pop.right!= null ) treeNodeStack1.add(pop.right);
                    if (pop.left != null)  treeNodeStack1.add(pop.left);
                }
            }
            result.add(integers);
            depth++;
        }
        return result;

    }

}
