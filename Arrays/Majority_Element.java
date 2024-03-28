
public class Majority_Element {
    public static void majority(int arr[], int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;

                }
            }
            if (count > n / 2) {
                System.out.println(arr[i]);
                break;
            }

        }
    }
    /*
     * time : O(n^2);
     * space : O(1);
     */

    public static void main(String args[]) {
        int arr[] = { 7, 7, 8, 8, 8 };
        int n = arr.length;
        majority(arr, n);

    }

}
