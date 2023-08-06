package com.wenbo.BM33;

import com.wenbo.BM27.TreeNode;

public class SolutionBM33 {

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param pRoot TreeNode类
     * @return TreeNode类
     */
    public TreeNode Mirror (TreeNode pRoot) {
        // write code here
        if (pRoot==null){
            return null;
        }
        TreeNode temp = pRoot.right;
        pRoot.right = pRoot.left;
        pRoot.left = temp;
        Mirror(pRoot.left);
        Mirror(pRoot.right);
        return pRoot;
    }

}
