public class EvenOdd {
    public static void evenOdd(int arr[], int n) {
        int count = 0;
        int i = 0;
        while (arr[i] % 2 == 0 && i > n - 1) {
            arr[count++] = arr[i];
            i++;
        }

    }

    public static void main(String args[]) {
        int arr[] = { 7, 2, 9, 4, 6, 1, 3, 8, 5 };
        int n = arr.length;
        evenOdd(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}