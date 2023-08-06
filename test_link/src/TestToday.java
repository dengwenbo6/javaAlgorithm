package src;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TestToday {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        treeNode.right.left = new TreeNode(6);
        treeNode.left.left = new TreeNode(4);
        treeNode.left.right = new TreeNode(5);


        List list = s(treeNode);
        System.out.println(list);
    }

    public static List s(TreeNode treeNode){
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<Integer> integers = new ArrayList<>();
        queue.add(treeNode);
        while (!queue.isEmpty()){
            TreeNode poll = queue.poll();
            integers.add(poll.value);
            if (poll.left!=null){
                queue.add(poll.left);
            }
            if (poll.right!= null){
                queue.add(poll.right);
            }
        }
        return integers;
    }
}


class TreeNode{
    int value;
    TreeNode left;
    TreeNode right;

    public TreeNode(int value){
        this.value = value;
    }
}
