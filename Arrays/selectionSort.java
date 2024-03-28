public class selectionSort {
    public static void printList(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // time complexity :
    // O(n^2);

    public static void main(String args[]) {
        int arr[] = { 3, 8, 6, 2, 5 };
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }

            // swap
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;

        }
        printList(arr, n);

    }

}
