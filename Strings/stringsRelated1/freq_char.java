package stringsRelated1;

import java.util.*;

public class freq_char {
    public static void frquency(String str, int n) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : str.toCharArray()) {
            if (map.containsKey(x)) {
                map.put(x, map.get(x) + 1);
            } else {
                map.put(x, 1);
            }
        }
        for (char y : map.keySet()) {
            System.out.print(y + "" + map.get(y));
        }
    }
    /*
     * time : O(n); for traversing
     * space : O(n); using hashmap
     * 
     */

    public static void main(String args[]) {
        String str = "abaacdeddc";
        int n = str.length();
        frquency(str, n);
    }

}
