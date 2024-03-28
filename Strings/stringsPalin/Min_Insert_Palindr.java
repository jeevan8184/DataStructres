package Strings.stringsPalin;

public class Min_Insert_Palindr {
    public static int insertions(String str, int n) {
        int count[] = new int[26];
        int res = 0;

        for (int i = 0; i < n; i++) {
            count[str.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (count[i] % 2 == 1)
                res++;
        }
        return res - 1;

    }
    /*
     * time : O(n);
     * space : O(1);
     */

    public static void main(String args[]) {
        String str = "geeksforgeeks";
        int n = str.length();
        System.out.println(insertions(str, n));
    }

}
