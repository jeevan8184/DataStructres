package new_folder;

public class InsertSort {
    public static int insert(int arr[], int n, int key /* , int capacity */) {
        // if (n >= capacity)
        // return n;
        int i;
        for (i = n - 1; (i >= 0 && arr[i] > key); i--)
            arr[i + 1] = arr[i];
        arr[i + 1] = key;
        return (n + 1);

    }

    public static void main(String args[]) {
        int[] arr = new int[20];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 25;
        arr[3] = 30;
        arr[4] = 40;
        arr[5] = 47;
        int n = 6;
        int key = 27;
        // int capacity = arr.length;

        System.out.print("Before insertion : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        n = insert(arr, n, key /* , capacity */);
        System.out.print("After insertion : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
