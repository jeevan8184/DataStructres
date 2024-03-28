package Dynamic_programming;

public class coinsChange_TargetSum {
    // coinsChange no.ways
    public static int coinsCh(int[] coins, int sum) {
        int n = coins.length;
        int dp[][] = new int[n + 1][sum + 1];
        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                if (coins[i - 1] <= j) {
                    dp[i][j] = dp[i][j - coins[i - 1]] + dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        printdp(dp);
        return dp[n][sum];
    }

    public static void printdp(int[][] dp) {
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // targetSumsubset
    public static boolean targetSumsubset(int arr[], int sum) {
        int n = arr.length;
        boolean dp[][] = new boolean[n + 1][sum + 1];
        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = true;
        }
        for (int j = 1; j < sum + 1; j++) {
            dp[0][j] = false;
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                int v = arr[i - 1];
                if (v <= j && dp[i - 1][j - v]) { // include also true
                    return true;
                } else if (dp[i - 1][j]) { // exclude also true
                    return true;
                }
            }
        }
        print(dp);
        return dp[n][sum];
    }

    public static void print(boolean[][] dp) {
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // int[] coins = { 2, 3, 5, 6 };
        // int sum = 10;
        // System.out.println(coinsCh(coins, sum));
        int arr[] = { 4, 2, 7, 1, 3 };
        int target = 10;
        System.out.println(targetSumsubset(arr, target));

    }
}
