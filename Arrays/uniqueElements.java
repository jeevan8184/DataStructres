import java.util.*;

public class uniqueElements {

    /*
     * Time complexity : O(n);
     * Auxiliary space : O(n);
     */
    public static void main(String args[]) {
        int arr[] = { 12, 10, 9, 45, 2, 10, 10, 45 };
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                break;
            } else {
                set.add(arr[i]);
                System.out.print(arr[i] + " ");
            }

        }
    }

}
