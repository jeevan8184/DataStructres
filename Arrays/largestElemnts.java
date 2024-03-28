import java.util.Arrays;

public class largestElemnts {
    public static int euilibrium(int arr[], int n) {
        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            int l = i;
            int r = n - 1;

            int sum = l, sum1 = r;
            if (-arr[sum] == arr[sum1]) {
                return i - 1;
            }
            if (-arr[sum] > arr[sum1]) {
                r--;
            } else if (-arr[sum] < arr[sum]) {
                return l++;
            }

        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = { -7, 1, 5, 2, -4, 3 };
        int n = arr.length;
        System.out.println(euilibrium(arr, n));

    }

}
