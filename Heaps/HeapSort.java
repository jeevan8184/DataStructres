package Heaps;

public class HeapSort {
    public static void heapify(int arr[], int i, int size) {
        int left = 2 * i + 1, right = 2 * i + 2;
        int minIdx = i;
        while (left < size && arr[left] > arr[minIdx]) {
            minIdx = left;
        }
        while (right < size && arr[right] > arr[minIdx]) {
            minIdx = right;
        }
        if (minIdx != i) {
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
            heapify(arr, minIdx, size);
        }
    }

    // Time complexity:O(nlogn)
    public static void heapSort(int arr[]) {

        int n = arr.length;
        for (int i = n / 2; i >= 0; i--) {
            heapify(arr, i, n);
        }
        // push at bottom
        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, 0, i);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5, 3 };
        heapSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
