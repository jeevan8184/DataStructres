public class reversArray {
    public static void devide(int arr[], int si, int ei) {
        if (si >= ei)
            return;

        // swap
        int temp = arr[si];
        arr[si] = arr[ei];
        arr[ei] = temp;
        devide(arr, si + 1, ei - 1);
    }

    public static void main(String args[]) {
        int arr[] = { 7, 9, 5, 9, 0, 4, 6 };
        int n = arr.length;

        devide(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
