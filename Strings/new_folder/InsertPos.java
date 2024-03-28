package new_folder;
//

public class InsertPos {
    public static void insertElement(int arr[], int n, int pos, int x) {
        for (int i = n - 1; i >= pos; i--) {
            arr[i + 1] = arr[i];
            arr[pos] = x;
        }

    }

    public static void main(String args[]) {
        int n = 5;
        int arr[] = new int[n * 2];
        arr[0] = 1;
        arr[1] = 5;
        arr[2] = 5;
        arr[3] = 9;
        arr[4] = 0;
        arr[5] = 3;
        int pos = 2;
        int x = 10;

        System.out.print("Before insrtion : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        insertElement(arr, n, pos, x);
        n += 1;
        System.out.print("After insertion : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");

        }
    }

}
