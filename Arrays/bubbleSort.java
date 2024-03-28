
public class bubbleSort {
    // private static int temp;

    public static void printList(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // time complexity :
    // O(n^2)

    public static void main(String args[]) {
        int arr[] = { 5, 3, 8, 6, 2 };
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
        printList(arr, n);

    }
}
