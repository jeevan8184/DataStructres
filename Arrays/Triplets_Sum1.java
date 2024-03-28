
public class Triplets_Sum1 {
    public static void triplet(int arr[], int n) {
        boolean found = false;
        for (int i = 0; i < n - 1; i++) {
            int l = i + 1;
            int r = n - 1;
            if (arr[i] + arr[l] + arr[r] == 0) {
                found = true;
                System.out.print(arr[i] + "," + arr[l] + "," + arr[r] + "\n");
            } else if (arr[i] + arr[l] + arr[r] < 0) {
                l++;
            } else {
                r--;
            }
        }
        if (found == false) {
            System.out.println("Not exists");
        }
    }
    /*
     * time : O(n^2); only 2 nested loops are required.
     * space : O(1); no extra space is required.
     */

    public static void main(String args[]) {
        int arr[] = { 0, -1, 2, -3, 1 };
        int n = arr.length;
        triplet(arr, n);

    }
}
