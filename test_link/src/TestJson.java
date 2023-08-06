package src;

import java.util.*;

public class TestJson {
    public static void main(String[] args) {
        int[] array = new int[]{1,3,2,8,5};
        Stack<Integer> integers = new Stack<>();
        Deque<Integer> deque =  new LinkedList<>();
        String s = Arrays.toString(array);
        System.out.println(s);
        String json = "{name:xiaoming,age:20}";
        boolean matches = json.matches("\\d+");
        System.out.println(matches);
        ArrayList<String> list = new ArrayList<>();
        list.add("2");
        list.add("h");
        System.out.println(list.get(0).matches("\\d+"));
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            
        }
        Stack<Character> characters = new Stack<>();
        characters.push('a');

    }


}
