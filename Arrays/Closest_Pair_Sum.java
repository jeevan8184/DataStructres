public class Closest_Pair_Sum {
    public static void closest(int arr[], int n, int x) {
        int diff = Integer.MAX_VALUE;
        int res1 = 0, res2 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (Math.abs(arr[i] + arr[j] - x) < diff) {
                    res1 = i;
                    res2 = j;
                    diff = Math.abs(arr[i] + arr[j] - x);
                }
            }
        }

        System.out.println(arr[res1] + " and " + arr[res2]);

    }
    /*
     * time : O(n^2);
     * space : O(1);
     */

    public static void main(String args[]) {
        int arr[] = { 10, 22, 28, 29, 30, 40 };
        int n = arr.length;
        int x = 54;
        closest(arr, n, x);

    }

}
