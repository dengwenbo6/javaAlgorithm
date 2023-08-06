package src;

import com.wenbo.BM57.SolutionBM57;

public class BM57Test {
    public static void main(String[] args) {
        char[][] num = new char[][]{{'1','1','0','0','0'},{'0','1','0','1','1'},{'0','0','0','1','1'},{'0','0','0','0','0'},{'0','0','1','1','1'}};
        int solve = new SolutionBM57().solve(num);
        System.out.println(solve);
    }
}
