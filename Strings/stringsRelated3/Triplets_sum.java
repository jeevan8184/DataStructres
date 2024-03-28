package stringsRelated3;

public class Triplets_sum {
    public static void findNumbers(int arr[], int n, int sum) {
        boolean found = false;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == sum) {
                        System.out.println(arr[i] + "," + arr[j] + "," + arr[k]);
                        found = true;
                    }

                }

            }
        }
        if (found == false) {
            System.out.println("Not exists");

        }

    }
    /*
     * time : O(n^3);
     * space : O(1);
     */

    public static void main(String args[]) {

        int arr[] = { 0, -1, 2, -3, 1 };
        int sum = 0;
        int n = arr.length;
        findNumbers(arr, n, sum);

    }

}
