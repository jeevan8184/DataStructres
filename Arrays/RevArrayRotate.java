public class RevArrayRotate {
    public static void Rotate(int arr[], int d, int n) {
        if (d == 0) {
            return;
        }
        d = d % n;
        reversArray(arr, 0, d - 1);
        reversArray(arr, d, n - 1);
        reversArray(arr, 0, n - 1);

    }

    public static void reversArray(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        // swap
        int temp = arr[si];
        arr[si] = arr[ei];
        arr[ei] = temp;
        reversArray(arr, si + 1, ei - 1);

    }

    public static void printList(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    /*
     * time : O(N);
     * space : O(1);
     */

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int d = 2;
        int n = arr.length;

        Rotate(arr, d, n);
        printList(arr, n);
    }

}
