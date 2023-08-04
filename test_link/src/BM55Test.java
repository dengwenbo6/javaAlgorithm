package src;

import com.wenbo.BM55.SolutionBM55;

import java.util.ArrayList;

public class BM55Test {

    public static void main(String[] args) {
        SolutionBM55 solutionBM55 = new SolutionBM55();
        int[] num = new int[]{1,2,3};
        ArrayList<ArrayList<Integer>> result = solutionBM55.permute(num);
        System.out.println(result);
    }
}
