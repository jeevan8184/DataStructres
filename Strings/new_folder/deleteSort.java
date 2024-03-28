package new_folder;

public class deleteSort {
    public static int search(int arr[], int low, int high, int key) {
        if (high < low)
            return -1;
        int mid = (low + high) / 2;
        if (key == arr[mid])
            return mid;
        if (mid > key)
            return search(arr, mid + 1, high, key);
        return search(arr, low, mid - 1, key);
    }

    public static int delete(int arr[], int n, int key) {

        int pos = search(arr, 0, arr.length, key);
        if (pos == -1) {
            System.out.println("Element not found");
        }
        for (int i = pos; i < n - 1; i++)
            arr[i] = arr[i + 1];
        return n - 1;

    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, };
        int key = 5;
        int n = arr.length;

        System.out.println("Before deletion : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        n = delete(arr, n, key);
        System.out.println("After deletion : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
