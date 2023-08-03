package com.wenbo.BM29;

import com.wenbo.BM23.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class SolutionBM29 {
    /**
     *
     * @param root TreeNode类
     * @param sum int整型
     * @return bool布尔型
     */
    public boolean hasPathSum (TreeNode root, int sum) {
        // write code here
        if (root==null){
            return false;
        }
        Queue<TreeNode> treeNodeQueue = new LinkedList<>();
        Queue<Integer> integerQueue = new LinkedList<>();
        treeNodeQueue.add(root);
        integerQueue.add(root.val);
        while (!treeNodeQueue.isEmpty()){
            int treeNodeLength = treeNodeQueue.size();
            for (int i=0;i<treeNodeLength;i++){
                TreeNode nodePoll = treeNodeQueue.poll();
                Integer integerPoll = integerQueue.poll();
                if (nodePoll.left!= null) {
                    treeNodeQueue.add(nodePoll.left);
                    integerQueue.add(integerPoll+nodePoll.left.val);
                }
                if (nodePoll.right != null){
                    treeNodeQueue.add(nodePoll.right);
                    integerQueue.add(integerPoll+nodePoll.right.val);
                }
                if (nodePoll.left == null && nodePoll.right==null){
                    if (integerPoll==sum){
                        return true;
                    }
                }
            }
        }
        return false;

    }
}
