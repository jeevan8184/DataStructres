public class Triplets_Sum_Zero {
    public static void sum(int arr[], int n) {
        boolean found = false;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        found = true;
                        System.out.print(arr[i] + "," + arr[j] + "," + arr[k] + "\n");

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
        int n = arr.length;
        sum(arr, n);

    }

}
