package AllGraphs;

import java.util.*;

class INTERSECTION {
    public static int intersection(int arr1[], int arr2[]) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int j = 0; j < arr2.length; j++) {
            if (set.contains(arr2[j])) {
                count++;
                set.remove(arr2[j]);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr1[] = { 7, 5, 9, 3, 0, 5 };
        int arr2[] = { 7, 9, 4, 7, 3, 5, 3 };
        System.out.println(intersection(arr1, arr2));
    }
}