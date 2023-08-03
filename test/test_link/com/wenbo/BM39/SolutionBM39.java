package com.wenbo.BM39;

import com.wenbo.BM23.TreeNode;

public class SolutionBM39 {

    private int index=-1;

    public String Serialize(TreeNode root) {
        StringBuilder stringBuilder = new StringBuilder();
        intervalSerialize(stringBuilder, root);
        return stringBuilder.toString();
    }

    private void intervalSerialize(StringBuilder stringBuilder, TreeNode root) {
        if (root == null){
            stringBuilder.append("#,");
            return;
        }
        stringBuilder.append(root.val).append(",");
        intervalSerialize(stringBuilder,root.left);
        intervalSerialize(stringBuilder,root.right);
    }

    public TreeNode Deserialize(String str) {
        if (str ==null || str.isEmpty()){
            return null;
        }

        String[] split = str.split(",");
        return internalDeserialize(split);
    }

    private TreeNode internalDeserialize(String[] words) {
        index++;
        if (index >= words.length) {
            return null;
        }
        if ("#".equals(words[index])) {
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(words[index]));
        root.left = internalDeserialize(words);
        root.right = internalDeserialize(words);
        return root;
    }
}
