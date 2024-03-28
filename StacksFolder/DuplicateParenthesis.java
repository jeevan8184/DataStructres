package StacksFolder;

import java.util.Stack;

public class DuplicateParenthesis {
    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == ')') {
                int cnt = 0;
                while (s.peek() != '(') {
                    s.pop();
                    cnt++;
                }
                if (cnt < 1) {
                    return true;
                } else {
                    s.pop();
                }
            } else {
                s.push(c);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "((a+b)+3)";
        System.out.println(isDuplicate(str));
    }
}
