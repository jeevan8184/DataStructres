public class Rearrang_ARRAY {
    public static void rearrange(int arr[], int n) {
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (i == arr[j]) {
                    // swap
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (i = 0; i < n; i++) {
            if (arr[i] != i) {
                arr[i] = -1;
            }
        }
        System.out.println("After replacing of arr : ");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
    /*
     *  time : O(n^2);
     *  space :O(1);
     */

    public static void main(String args[]) {
        int arr[] = { -1, -1, 6, 1, 9, 3, 2, -1, 4, -1 };
        int n = arr.length;
        rearrange(arr, n);
    }

}
