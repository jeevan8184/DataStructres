package AllGraphs;

public class PRACTICESHEET {
    public static int printPaths(int i, int j, int n, int m) {

        if (i == n - 1 || j == m - 1) {
            return 1;
        }

        int rightPaths = printPaths(i + 1, j, n, m);
        int downPaths = printPaths(i, j + 1, n, m);
        return rightPaths + downPaths;

    }

    public static void main(String args[]) {
        int n = 3, m = 3;
        System.out.println(printPaths(0, 0, n, m));

    }

}
