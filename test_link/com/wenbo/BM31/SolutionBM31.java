package com.wenbo.BM31;

import com.wenbo.BM27.TreeNode;

public class SolutionBM31 {

    boolean isSymmetrical(TreeNode pRoot) {
        return recur(pRoot,pRoot);
    }

    private boolean recur(TreeNode pRoot1, TreeNode pRoot2) {
        if (pRoot1==null && pRoot2==null){
            return true;
        }

        if (pRoot1 ==null || pRoot2==null ||pRoot1.val!= pRoot2.val){
            return false;
        }
        return recur(pRoot1.left,pRoot2.right) && recur(pRoot1.right,pRoot2.left);
    }
}
