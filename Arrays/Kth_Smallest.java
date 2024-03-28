import java.util.Arrays;

public class Kth_Smallest {

    public static int smallest(int arr[], int k) {

        Arrays.sort(arr);
        return arr[k - 1];

    }
    /*
     * time : O(nlogn);
     * space :O(1);
     */

    public static void main(String args[]) {
        int arr[] = { 7, 10, 4, 3, 20, 15 };
        int k = 3;
        System.out.println(smallest(arr, k));

    }

}
