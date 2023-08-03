package src;

import com.wenbo.BM22.SolutionBM22;

public class BM22Test {

    public static void main(String[] args) {
        String version1 = "2.0.1";
        String version2 = "2";
        int compare = new SolutionBM22().compare(version1, version2);
        System.out.println(compare);
    }
}
