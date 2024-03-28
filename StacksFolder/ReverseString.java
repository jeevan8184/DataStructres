package StacksFolder;

import java.util.Stack;

public class ReverseString {
    public static String reverse(Stack<Character> s, String str) {
        for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        while (!s.isEmpty()) {
            sb.append(s.pop());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Stack<Character> s = new Stack<>();
        String str = "adba";
        System.out.println(reverse(s, str));
    }

}
