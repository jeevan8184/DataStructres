import java.util.*;

public class singleElement {
    public static int singlElement(int arr[], int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            map.put(arr[i], 1);
        }
        for (int i = 0; i < n; i++) {
            if (map.get(arr[i]) == 1)
                return arr[i];
        }
        return -1;

    }

    public static void main(String args[]) {
        int arr[] = { 2, 3, 5, 4, 5, 3, 4 };
        int n = arr.length;
        System.out.println(singlElement(arr, n));

    }
}
