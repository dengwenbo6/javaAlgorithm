package com.wenbo.BM26;

import com.wenbo.BM23.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class SolutionBM26 {
    /**
     *
     * @param root TreeNode类
     * @return int整型ArrayList<ArrayList<>>
     */
    public ArrayList<ArrayList<Integer>> levelOrder (TreeNode root) {
        // write code here
        if (root == null){
            return new  ArrayList<ArrayList<Integer>>();
        }
        Queue<TreeNode> treeNodeQueue =  new LinkedList<>();
        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();
        TreeNode curNode = root;
        treeNodeQueue.add(curNode);
        while (!treeNodeQueue.isEmpty()){
            int qLength = treeNodeQueue.size();
            ArrayList<Integer> integers = new ArrayList<>();
            for (int i=0;i<qLength;i++){
                TreeNode poll = treeNodeQueue.poll();
                integers.add(poll.val);
                if (poll.left != null){
                    treeNodeQueue.add(poll.left);
                }
                if (poll.right != null){
                    treeNodeQueue.add(poll.right);
                }
            }
            arrayLists.add(integers);
        }
        return arrayLists;

    }
}
