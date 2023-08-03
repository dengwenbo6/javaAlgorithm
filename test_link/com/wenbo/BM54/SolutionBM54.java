package com.wenbo.BM54;

import java.util.*;

/**
 *
 */

public class SolutionBM54 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param num int整型一维数组 
     * @return int整型ArrayList<ArrayList<>>
     */
    public static ArrayList<ArrayList<Integer>> threeSum (int[] num) {
        // write code here
        Integer len = num.length;
        if (len < 3){
            return new ArrayList<>();
        }
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for (int i = 0;i<len-2;i++){
            if (i!=0 && num[i] == num[i - 1]) continue;
            int left = i+1;
            int right = len -1;
            int target  = -num[i];
            while (left < right){
                int mid = num[left] + num[right];
                if (mid == target) {
                    result.add(new ArrayList<>(Arrays.asList(mid,num[left],num[right])));
                    while (left < right && num[left]==num[left+1]) left++;
                    while (left<right && num[right] == num[right-1]) right--;
                    left ++ ;
                    right --;
                }else if (mid < target){
                    left ++ ;
                }else {
                    right --;
                }
            }
        }

        return result;

    }
}