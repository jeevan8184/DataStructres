package Dynamic_programming;

public class minimum_partitioning {
    public static int minPart(int arr[]) {
        int n = arr.length;
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        // 0-1 knapsack
        int W = sum / 2;
        int dp[][] = new int[n + 1][W + 1];
        // init()
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < W + 1; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
            }
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < W + 1; j++) {
                if (arr[i - 1] <= j) {
                    dp[i][j] = Math.max(arr[i - 1] + dp[i - 1][j - arr[i - 1]], dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        int sum1 = dp[n][W];
        int sum2 = sum - sum1;
        return Math.abs(sum1 - sum2);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 6, 11, 5 };
        System.out.println(minPart(arr));
    }
}
