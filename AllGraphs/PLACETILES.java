package AllGraphs;

public class PLACETILES {
    public static int placeTiles(int n, int m) {
        if (n == m) {
            return 2;
        }
        if (n < m) {
            return 1;
        }
        int rightPaths = placeTiles(n - 1, m);
        int downPaths = placeTiles(n - m, m);
        return rightPaths + downPaths;
    }

    public static void main(String args[]) {
        int n = 4, m = 2;
        System.out.println(placeTiles(n, m));
    }

}
