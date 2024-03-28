package stringsRelated2;

import java.util.*;

public class WildCard_char1 {
    public static void print(String str) {
        Queue<String> q = new LinkedList<>();
        q.add(str);
        while (!q.isEmpty()) {
            str = q.remove();
            int idx = str.indexOf('?');

            if (idx != -1) {
                str = str.substring(0, idx) + "0" + str.substring(idx + 1);
                q.add(str);
                str = str.substring(0, idx) + "1" + str.substring(idx + 1);
                q.add(str);

            } else {
                System.out.println(str);
            }
        }
    }
    /*
     * time : O(N*2^N);
     * space : O(2^N);
     */

    public static void main(String args[]) {
        String str = "1??0?101";
        print(str);

    }

}
