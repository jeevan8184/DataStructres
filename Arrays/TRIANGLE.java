public class TRIANGLE {
    public static int triangl(int arr[], int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] > arr[k])
                        count++;
                }
            }
        }
        return count;
    }

    /*
     * time : O(N^3); N is the size of the input array
     * space : O(1);
     */

    public static void main(String args[]) {
        int arr[] = { 10, 21, 22, 100, 101, 200, 300 };
        int n = arr.length;

        System.out.println(triangl(arr, n));
    }

}
