package com.wenbo.BM22;

public class SolutionBM22 {

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 比较版本号
     * @param version1 string字符串
     * @param version2 string字符串
     * @return int整型
     */
    public int compare (String version1, String version2) {
        // write code here
        int length1 = version1.length();
        int length2 = version2.length();
        int i=0,j=0;

        while (i < length1 || j < length2){
            long sum1 = 0;
            while (i < length1 && version1.charAt(i) != '.'){
                sum1 = sum1 * 10 + version1.charAt(i) - '0';
                i++;
            }
            i++;

            long sum2 = 0;
            while (j<length2 && version2.charAt(j) != '.'){
                sum2 = sum2*10 + version2.charAt(j) - '0';
                j++;
            }
            j++;
            if (sum1 >sum2){
                return 1;
            }
            if (sum2 > sum1 ){
                return -1;
            }
        }
        return 0;

    }


}
