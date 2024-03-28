package stringsRelated2;

import java.util.Arrays;

public class Sort_String {
    public static void sorting(String str) {
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        System.out.print(String.valueOf(arr));
    }
    /*
     * time : O(nlogn);
     * space : O(1);
     */

    public static void main(String args[]) {
        String str = "geeksforgeeks";
        sorting(str);

    }

}
