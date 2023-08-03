package src;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> integers1 = new ArrayList<>();
        integers1.add(3);
        System.out.println(integers1);
        ArrayList<Integer> clone = (ArrayList<Integer>) integers1.clone();
        clone.add(5);
        clone.remove(0);
        System.out.println(clone);
        if (!clone.isEmpty()) {
            System.out.println("**************");
        }
        System.out.println(integers1);
    }
}
