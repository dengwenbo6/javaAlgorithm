package com.wenbo.BM45;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class SolutionBM45 {
    public ArrayList<Integer> maxInWindows(int [] num, int size) {
        int num_length = num.length;
        if (size>num_length || size == 0) {
            return new ArrayList<>();
        }
        ArrayList<Integer> listMax = new ArrayList<>();
        listMax.add(1);
        listMax.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });

        for (int i = 0; i <= num_length - size; i++) {
            int max = num[i];
            for (int j = i + 1; j < size + i; j++) {
                if (max < num[j]) {
                    max = num[j];
                }
            }
            listMax.add(max);
        }
        return listMax;

    }
}
