public class EQUILIBRIUM_INDEX {
    public static int findEquilibrium(int arr[], int n) {
        int i, j;
        int LS, RS;
        for (i = 0; i < n; i++) {

            // LS
            LS = 0;
            for (j = 0; j < i; j++)
                LS += arr[j];
            // RS
            RS = 0;
            for (j = i + 1; j < n; j++)
                RS += arr[j];

            if (LS == RS)
                return i;
        }
        return -1;
    }
    /*
     * time :O(n^2);
     * space : O(1);
     */

    public static void main(String rags[]) {
        int arr[] = { -7, 1, 5, 2, -4, 3, 0 };
        int n = arr.length;
        System.out.println(findEquilibrium(arr, n));
    }

}
