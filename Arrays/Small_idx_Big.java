
public class Small_idx_Big {
    public static boolean check(int arr[], int n, int idx) {

        int i = idx - 1;
        int j = idx + 1;
        while (i >= 0) {
            if (arr[i] > arr[idx]) {
                return false;
            }
            i--;
        }
        while (j < n) {
            if (arr[j] < arr[idx]) {
                return false;
            }
            j++;
        }
        return true;

    }

    public static int findElement(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            if (check(arr, n, i)) {
                return i;
            }
        }
        return -1;
    }
    /*
     * Time Complexity: O(n^2), Time complexity of the
     * given program is O(n^2) as there are two nested while
     * loops in the check function, which are iterating over
     * at most n-2 elements each, and they are being called
     * for each element in the array except the first and
     * last elements.
     * Auxiliary Space: O(1), Space complexity of the program
     * is O(1) as no extra space is being used, except for the
     * input array and some integer variables used for indexing
     * and loop control.
     * 
     */

    public static void main(String args[]) {
        int arr[] = { 5, 1, 4, 3, 6, 8, 10, 7, 9 };
        int n = arr.length;
        System.out.println(findElement(arr, n));
    }

}
