public class largestElements2 {
    public static void largestEl(int arr[], int n) {
        int first = -1, second = -1, third = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                third = second;
                second = arr[i];
            } else if (arr[i] > third && arr[i] != second) {
                third = arr[i];
            }
        }
        // System.out.print(first + " ");
        System.out.print(second + " ");
        // System.out.print(third + " ");
    }

    /*
     * time : O(n);
     * space : O(1);
     */

    public static void main(String args[]) {
        int arr[] = { 12, 35, 1, 10, 34, 1 };
        int n = arr.length;
        largestEl(arr, n);
    }

}
