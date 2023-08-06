package src;

import java.util.Arrays;

public class TestArray {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6};
        int[][] array = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        System.out.println(Arrays.toString(array[0]));
        System.out.println(array.length);

        System.out.println(nums);
        System.out.println(Arrays.copyOfRange(nums,0,3));
    }
}
