package new_folder;

public class Delete {
    public static int findElement(int arr[], int n, int x) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }

    public static int delete(int arr[], int n, int x) {

        int pos = findElement(arr, n, x);
        if (pos == -1) {
            System.out.println("Element not found");

        }
        for (int i = pos; i < n - 1; i++)
            arr[i] = arr[i + 1];
        return n - 1;
    }

    // Time complxity O(N);

    public static void main(String args[]) {
        int arr[] = { 10, 29, 40, 76, 46, 50, 10 };
        int n = arr.length;
        int x = 40;

        System.out.print("Before Deletion : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        n = delete(arr, n, x);

        System.out.print("Afterr Deletion : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
