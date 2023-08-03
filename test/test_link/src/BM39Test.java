package src;

import com.wenbo.BM23.SolutionBM23;
import com.wenbo.BM23.TreeNode;
import com.wenbo.BM39.SolutionBM39;

import java.util.ArrayList;
import java.util.Arrays;

public class BM39Test {
    public static void main(String[] args) {
        String string = new String("1,2,3,#,#,6,7");
        SolutionBM39 solutionBM39 = new SolutionBM39();
        TreeNode deserialize = solutionBM39.Deserialize(string);
        String serialize = new SolutionBM39().Serialize(deserialize);
        System.out.println(serialize);
        System.out.println(deserialize);
        int[] arrayLists =
                new SolutionBM23().preorderTraversal(deserialize);
        for (int i = 0; i < arrayLists.length; i++) {
            System.out.print(arrayLists[i]+",");
        }

        ArrayList<Integer> integers = new ArrayList<>();
        integers.set(1,2);
        System.out.println(integers);
    }
}
