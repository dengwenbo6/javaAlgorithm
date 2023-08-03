package com.wenbo.BM28;

import com.wenbo.BM23.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class SolutionBM28 {
    /**
     *
     * @param root TreeNode类
     * @return int整型
     */
    public int maxDepth (TreeNode root) {
        // write code here
        if (root == null){
            return 0;
        }
        Queue<TreeNode> treeNodeQueue = new LinkedList<>();
        treeNodeQueue.add(root);
        int depth = 0;
        while (!treeNodeQueue.isEmpty()){
            depth++;
            int queueLength = treeNodeQueue.size();
            for (int i=0;i<queueLength;i++){
                TreeNode poll = treeNodeQueue.poll();
                if (poll.left != null) treeNodeQueue.add(poll.left);
                if (poll.right != null) treeNodeQueue.add(poll.right);
            }
        }
        return depth;



    }
}
