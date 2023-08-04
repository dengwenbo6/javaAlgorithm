package src;

import com.wenbo.BM54.AbSolutionBM54;
import com.wenbo.BM54.SolutionBM54;

import java.util.ArrayList;

public class BM54Test {

    public static void main(String[] args) {

        int[] num = new int[]{0,-1,1};
        ArrayList<ArrayList<Integer>> result = new SolutionBM54().threeSum(num);
        System.out.println(result.toString());
    }
}
