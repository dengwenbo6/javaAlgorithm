package com.wenbo.BM32;

import com.wenbo.BM27.TreeNode;

public class SolutionBM32 {

    /**
     *
     * @param t1 TreeNode类
     * @param t2 TreeNode类
     * @return TreeNode类
     */
    public TreeNode mergeTrees (TreeNode t1, TreeNode t2) {
        // write code here
        if (t1==null && t2==null){
            return null;
        }else if (t1==null && t2!=null){
            t1 =  t2;
            return t1;
        }else if (t1!=null && t2==null){
            return t1;
        }else {
            t1.val += t2.val;
            t2.val = t1.val;
            mergeTrees(t1.left,t2.left);
            mergeTrees(t1.right,t2.right);

            return t1;
        }

    }
}
