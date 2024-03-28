package stringsRelated2;

import java.util.*;

public class revString_Stack {
    public static String reverse(char[] str) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length; i++) {
            st.push(str[i]);
        }
        for (int i = 0; i < str.length; i++) {
            str[i] = st.peek();
            st.pop();
        }
        return String.valueOf(str);

    }

    /*
     * time : O(n);
     * space :O(n);
     */

    public static void main(String args[]) {
        String str = "geeksforgeeks";
        str = reverse(str.toCharArray());
        System.out.println(str);

    }

}
