package Dynamic_programming;

public class knapsack {
    public static int knapRec(int val[], int wt[], int W, int n) {
        if (W == 0 || n == 0) {
            return 0;
        }
        if (wt[n - 1] <= W) {
            int ans1 = val[n - 1] + knapRec(val, wt, W - wt[n - 1], n - 1);
            int ans2 = knapRec(val, wt, W, n - 1);
            return Math.max(ans1, ans2);
        } else {
            return knapRec(val, wt, W, n - 1);
        }
    }

    // memoizaton
    public static int knapMem(int val[], int wt[], int W, int n, int dp[][]) {
        if (W == 0 || n == 0) {
            return 0;
        }
        if (dp[n][W] != -1) {
            return dp[n][W];
        }
        if (wt[n - 1] <= W) {
            int ans1 = val[n - 1] + knapMem(val, wt, W - wt[n - 1], n - 1, dp);
            int ans2 = knapMem(val, wt, W, n - 1, dp);
            dp[n][W] = Math.max(ans1, ans2);
            return dp[n][W];
        } else {
            dp[n][W] = knapMem(val, wt, W, n - 1, dp);
            return dp[n][W];
        }
    }

    // tabultion
    public static void print(int[][] dp) {
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // 0-1 knapsack
    public static int knapSacks(int val[], int wt[], int W) {
        int n = val.length;
        int dp[][] = new int[n + 1][W + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 0;
        }
        for (int j = 0; j < dp.length; j++) {
            dp[0][j] = 0;
        }
        // initialize i-values && j-weight
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < W + 1; j++) {
                int v = val[i - 1];
                int wtg = wt[i - 1];
                if (wtg <= j) {
                    int incprofit = v + dp[i - 1][j - wtg];
                    int exprofit = dp[i - 1][j];
                    dp[i][j] = Math.max(incprofit, exprofit);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        print(dp);
        return dp[n][W];
    }

    // unbounded
    public static int unboundedKnapSack(int val[], int wt[], int W) {
        int n = val.length;
        int dp[][] = new int[n + 1][W + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 0;
        }
        for (int j = 0; j < dp.length; j++) {
            dp[0][j] = 0;
        }
        // initialize i-values && j-weight
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < W + 1; j++) {
                int v = val[i - 1];
                int wtg = wt[i - 1];
                if (wtg <= j) {
                    int incprofit = v + dp[i][j - wtg];// this is difference
                    int exprofit = dp[i - 1][j];
                    dp[i][j] = Math.max(incprofit, exprofit);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        print(dp);
        return dp[n][W];
    }

    public static void main(String[] args) {
        int val[] = { 15, 14, 10, 45, 30 };
        int wt[] = { 2, 5, 1, 3, 4 };
        int W = 7;
        int n = val.length;
        System.out.println(knapSacks(val, wt, W));
        System.out.println();
        System.out.println(unboundedKnapSack(val, wt, W));
        System.out.println();
        System.out.println(knapRec(val, wt, W, n));
        int dp[][] = new int[n + 1][W + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println();
        System.out.println(knapMem(val, wt, W, n, dp));
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
