public class Smallest_Missing_NO1 {
    public static int firstMissing(int arr[], int start, int end) {
        if (start > end)
            return end + 1;

        if (start != arr[start])
            return start;

        int mid = start + (end - start) / 2;
        if (arr[mid] == mid)
            return firstMissing(arr, mid + 1, end);

        return firstMissing(arr, start, mid);
    }

    public static void main(String args[]) {
        int arr[] = { 0, 2, 1, 3, 4, 5, 6, 6, 9, 10 };
        int n = arr.length;

        System.out.println(firstMissing(arr, 0, n - 1));
    }

}
