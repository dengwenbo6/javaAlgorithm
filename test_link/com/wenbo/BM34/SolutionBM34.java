package com.wenbo.BM34;

import com.wenbo.BM27.TreeNode;

public class SolutionBM34 {

    private int minNum = Integer.MIN_VALUE;
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param root TreeNode类
     * @return bool布尔型
     */
    public boolean isValidBST (TreeNode root) {
        // write code here
        if (root==null) return true;

        if (!isValidBST(root.left)) return false;

        if (root.val < minNum) return false;

        minNum = root.val;

//        if (!isValidBST(root.right)) return false;
        return !isValidBST(root.right) ? false : true;
    }
}
