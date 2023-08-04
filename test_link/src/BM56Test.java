package src;

import com.wenbo.BM55.SolutionBM55;
import com.wenbo.BM56.SolutionBM56;

import java.util.ArrayList;

public class BM56Test {
    public static void main(String[] args) {
        SolutionBM55 solutionBM55 = new SolutionBM55();
        int[] num = new int[]{1,1,3};
        ArrayList<ArrayList<Integer>> result = new SolutionBM56().permuteUnique(num);
        System.out.println(result);
    }
}
