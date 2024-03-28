package stringsRelated1;

public class All_SubStringss {
    public static void substrings(String str, int n) {
        if (n == 0) {
            return;
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                // for (int k = i; k <= j; k++) {
                System.out.println(str.substring(i, j));
                // without writing k loop;
                // System.out.print(str.charAt(k));
                // }
                // System.out.println();
            }
        }
    }
    /*
     * time : O(n^3);
     * space : O(1);
     */

    public static void main(String args[]) {
        String str = "abcd";
        int n = str.length();
        substrings(str, n);

    }

}
