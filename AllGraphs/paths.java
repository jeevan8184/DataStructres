package AllGraphs;

public class paths {
    public static int countPaths(int i, int j, int n, int m) {
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        if (i == n || j == m) {
            return 0;
        }

        int downPaths = countPaths(i, j + 1, n, m);
        int rightPaths = countPaths(i + 1, j, n, m);
        return downPaths + rightPaths;
    }

    public static void main(String args[]) {
        int n = 3, m = 3;
        System.out.println(countPaths(0, 0, n, m));

    }

}
