package AllGraphs;

public class increasing {
    public static boolean isSorted(int idx, int arr[]) {
        if (idx == arr.length - 1) {
            return true;
        }
        if (arr[idx] < arr[idx + 1]) {
            return isSorted(idx + 1, arr);
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 3, 5 };
        System.out.println(isSorted(0, arr));
    }

}
