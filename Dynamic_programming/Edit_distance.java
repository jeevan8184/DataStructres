package Dynamic_programming;

import java.util.*;

public class Edit_distance {
    // lcs
    public static int lcs(String str1, String str2) {

        int n = str1.length(), m = str2.length();
        int dp[][] = new int[n + 1][m + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m + 1; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
            }
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    int ans1 = dp[i - 1][j];
                    int ans2 = dp[i][j - 1];
                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }
        return dp[n][m];
    }

    /* hi */
    public static int editDistance(String str1, String str2) { // operations
        int n = str1.length(), m = str2.length();
        int dp[][] = new int[n + 1][m + 1];
        // initialize
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m + 1; j++) {
                if (i == 0) {
                    dp[i][j] = j;
                }
                if (j == 0) {
                    dp[i][j] = i;
                }
            }
        }

        // bottom to up
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    int add = dp[i][j - 1] + 1;// add
                    int del = dp[i - 1][j] + 1;// delete
                    int repl = dp[i - 1][j - 1] + 1;// replace
                    dp[i][j] = Math.min(Math.max(add, del), repl);
                }
            }
        }
        return dp[n][m];
    }

    // edit distance using add and delete oper
    public static int edit(String str1, String str2) {
        int n = str1.length(), m = str2.length();
        int oper = lcs(str1, str2);
        int del = n - oper;
        int add = m - oper;
        return del + add;

    }
    // public static int editRec(String str1,String str2,int n,int m) {
    // if(n==0 || m==0) {
    // return 0;
    // }

    // }

    public static void main(String[] args) {
        String str1 = "abc", str2 = "sbd";
        System.out.println(editDistance(str1, str2));
        System.err.println();
        System.out.println(edit(str1, str2));

    }
}
