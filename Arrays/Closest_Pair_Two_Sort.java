public class Closest_Pair_Two_Sort {
    public static void closest(int arr1[], int arr2[], int m, int n, int x) {
        int diff = Integer.MAX_VALUE;

        int res_l = 0, res_r = 0;

        int l = 0;
        int r = n - 1;
        while (l < m && r >= 0) {

            if (Math.abs(arr1[l] + arr2[r] - x) < diff) {
                res_l = l;
                res_r = r;
                diff = Math.abs(arr1[l] + arr2[r] - x);
            }
            if (arr1[l] + arr2[r] > x)
                r--;
            else
                l++;
        }
        System.out.println(arr1[res_l] + " and " + arr2[res_r]);
    }
    /*
     * time : O(n);
     * space : O(1);
     */

    public static void main(String args[]) {
        int arr1[] = { 1, 4, 5, 7 };
        int arr2[] = { 10, 20, 30, 40 };
        int m = arr1.length;
        int n = arr2.length;
        int x = 32;
        closest(arr1, arr2, m, n, x);

    }

}
