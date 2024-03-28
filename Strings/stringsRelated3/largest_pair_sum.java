package stringsRelated3;

public class largest_pair_sum {
    public static int largest(int arr[], int n) {
        int sum = Integer.MIN_VALUE;// ==0
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] > sum) {
                    sum = arr[i] + arr[j];
                }
            }
        }
        return sum;
    }
    /*
     * time : O(n^2);
     * space : O(1);
     */

    public static void main(String args[]) {
        int arr[] = { 12, 34, 10, 6, 40 };
        int n = arr.length;
        System.out.println(largest(arr, n));

    }

}
