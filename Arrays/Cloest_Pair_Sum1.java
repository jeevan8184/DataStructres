public class Cloest_Pair_Sum1 {

    public static void closest(int arr[], int x, int n) {
        int diff = Integer.MAX_VALUE;
        int res1 = 0, res2 = 0;

        int l = 0, r = n - 1;
        while (l < r) {
            if (Math.abs(arr[l] + arr[r] - x) < diff) {
                res1 = l;
                res2 = r;
                diff = Math.abs(arr[l] + arr[r] - x);
            }
            if (arr[l] + arr[r] > x)
                r--;
            else
                l++;

        }
        System.out.println(arr[res1] + " and " + arr[res2]);

    }
    /*
     * time : O(n);
     * space : O(1);
     */

    public static void main(String args[]) {
        int arr[] = { 10, 22, 28, 29, 30, 40 };
        int x = 54;
        int n = arr.length;
        closest(arr, x, n);

    }

}
