package AllGraphs;

import java.util.HashSet;

public class unique {
    public static void subsequences(String str, int idx, String newString, HashSet<String> set) {
        if (idx == str.length()) {
            if (set.contains(newString)) {
                return;
            } else {
                set.add(newString);
                System.out.println(newString);
                return;
            }
        }

        char currChar = str.charAt(idx);

        // to add
        subsequences(str, idx + 1, newString + currChar, set);
        // not to add
        subsequences(str, idx + 1, newString, set);

    }

    public static void main(String args[]) {

        String str = "aaa";
        HashSet<String> set = new HashSet<>();

        subsequences(str, 0, " ", set);

    }

}
