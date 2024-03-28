import java.util.Arrays;

public class Two_Pointers {
    public static int twoPointers(int arr[], int n, int x) {

        int i = 0;
        int j = n - 1;
        while (i < j) {
            if (arr[i] + arr[j] == x)
                return 1;
            else if (arr[i] + arr[j] < x)
                i++;
            else
                j--;
        }
        return 0;

    }

    public static void main(String args[]) {
        int arr[] = { 80, 10, 20, 50, 75, 35 };
        int n = arr.length;
        int x = 70;
        Arrays.sort(arr);
        System.out.println(twoPointers(arr, n, x));

    }

}
