package src;

import com.wenbo.BM54.SolutionBM54;

import java.util.ArrayList;

public class BM54Test {

    public static void main(String[] args) {

        int[] num = new int[]{-2,0,1,1,2};
        ArrayList<ArrayList<Integer>> result = SolutionBM54.threeSum(num);
        System.out.println(result.toString());
    }
}
