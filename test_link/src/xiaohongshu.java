package src;
import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 *
 * If you define many classes, but you must have a class named Main and a public property.
 * The Main class should be the only public class.
 * The Main class must contain a static method (function) named "main"
 * Do not add any package, like "package main"
 *
 * The TestCase is shown below
 * Input : 1 2
 * Output : 3
 */

public class xiaohongshu {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        String s = "([)]";
        boolean flag = method(s);
        System.out.print(flag);
    }


    private static boolean method(String s){
        Stack<Character> stack1 = new Stack<>();
        for(char c:s.toCharArray()){
            if(c == '('){
                stack1.push(')');
            }else if(c == '['){
                stack1.push(']');
            }else if(c == '{'){
                stack1.push('}');
            }else if(stack1.pop()!= c){
                return false;
            }
        }
        if (stack1.isEmpty()){
            return true;
        }else {
            return false;
        }
    }
}