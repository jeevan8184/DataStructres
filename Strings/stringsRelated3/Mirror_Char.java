package stringsRelated3;

public class Mirror_Char {
    public static String mirror(String str, int n, int l) {
        String revAlpha = "zyxwvutsrqponmlkjihgfedcba";

        String ans = " ";
        for (int i = 0; i < n; i++)
            ans += str.charAt(i);
        for (int i = n; i < l; i++)
            ans += revAlpha.charAt(str.charAt(i) - 'a');

        return ans;
    }
    /*
     * time : O(n); n is the size of given string.
     * space : O(1); since no extra space is required.
     */

    public static void main(String args[]) {
        String str = "pneumonia";
        int n = 4;
        int l = str.length();
        // mirror(str, n, l);
        System.out.println(mirror(str, n - 1, l));

    }

}
