package Dynamic_programming;

import java.util.Arrays;

public class fibunacci {
    // using memoizarion
    public static int fib(int n, int arr[]) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (arr[n] != -1) {
            return arr[n];
        }
        arr[n] = fib(n - 1, arr) + fib(n - 2, arr);
        return arr[n];
    }

    // using tabulation
    public static int fibu(int n) {

        int dp[] = new int[n + 1];
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 5;
        int arr[] = new int[n + 1];
        Arrays.fill(arr, -1);
        System.out.println(fib(3, arr));
        System.out.println(fibu(3));
    }
}
