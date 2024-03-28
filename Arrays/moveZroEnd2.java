public class moveZroEnd2 {
    public static void pushZero(int arr[], int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0)
                arr[count++] = arr[i];

        }
        while (count < n)
            arr[count++] = 0;
    }

    /*
     * time : O(n);
     * space O(1);
     */

    public static void main(String args[]) {
        int arr[] = { 7, 2, 0, 4, 3, 0, 5, 0 };
        int n = arr.length;

        pushZero(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
