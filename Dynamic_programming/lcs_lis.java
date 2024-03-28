package Dynamic_programming;

import java.util.*;

public class lcs_lis {
    // longest common subsequence
    // tabulation
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

    // lcs
    // memoization
    public static int lcsMem(String str1, String str2, int n, int m, int dp[][]) {

        if (m == 0 || n == 0) {
            return 0;
        }
        if (dp[n][m] != -1) {
            return dp[n][m];
        }
        if (str1.charAt(n - 1) == str2.charAt(m - 1)) {
            return dp[n][m] = lcsMem(str1, str2, n - 1, m - 1, dp) + 1;
        } else {
            int ans1 = lcsMem(str1, str2, n - 1, m, dp);
            int ans2 = lcsMem(str1, str2, n, m - 1, dp);
            return dp[n][m] = Math.max(ans1, ans2);
        }
    }

    /* longest common substring */
    public static int lcsubstring(String str1, String str2) {
        int n = str1.length(), m = str2.length();
        int dp[][] = new int[n + 1][m + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m + 1; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
            }
        }
        int ans = 0;
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    ans = Math.max(ans, dp[i][j]);
                } else {
                    dp[i][j] = 0;
                }
            }
        }
        return ans;
    }

    public static int lcsSubstringRec(String str1, String str2, int n, int m, int cnt) {
        if (m == 0 || n == 0) {
            return 0;
        }

        if (str1.charAt(n - 1) == str2.charAt(m - 1)) {
            cnt = lcsSubstringRec(str1, str2, n - 1, m - 1, cnt + 1);
        }
        int str1Con = lcsSubstringRec(str1, str2, n, m - 1, 0);
        int str2Con = lcsSubstringRec(str1, str2, n - 1, m, 0);
        return Math.max(Math.max(str1Con, str2Con), cnt);

    }

    public static void main(String[] args) {
        String str1 = "abcdge";
        String str2 = "abedgf";
        System.out.println(lcs(str1, str2));
        int n = str1.length(), m = str2.length();
        int dp[][] = new int[n + 1][m + 1];
        for (int i = 0; i < n + 1; i++) {
            Arrays.fill(dp[i], -1);
        }
        System.out.println(lcsMem(str1, str2, n, m, dp));
        System.out.println(lcsubstring(str1, str2));
        System.out.println(lcsSubstringRec(str1, str2, n, m, 0));

    }
}
