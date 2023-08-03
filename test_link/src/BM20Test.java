package src;

import com.wenbo.BM20.BM20;

public class BM20Test {

    public static void main(String[] args) {
        int[] array ={1,2,3,4,5,6,7,0};
//        int i = new BM20().InversePairs(array);
        int i = new BM20().InversePairs2(array);
        System.out.println(i);
    }
}
