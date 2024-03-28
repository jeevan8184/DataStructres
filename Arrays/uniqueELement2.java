public class uniqueELement2 {

    /*
     * time complexty : O(n^2);
     * space complexity : O(1) since no extra space is required;
     */

    public static void main(String args[]) {
        int arr[] = { 12, 10, 9, 45, 2, 10, 10, 45, 2 };
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int j;
            for (j = 0; j <= i; j++)
                if (arr[i] == arr[j])
                    break;

            if (i == j)
                System.out.print(arr[i] + " ");

        }

    }

}
