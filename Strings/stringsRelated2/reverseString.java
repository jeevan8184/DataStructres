package stringsRelated2;

public class reverseString {
    public static void revstring(String str, int n) {

        char arr[] = str.toCharArray();

        for (int i = 0, j = n - 1; i < j; i++, j--) {
            // swap
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.println(arr);
    }
    /*
     * time : O(n);
     * space : O(1);
     */

    public static void main(String args[]) {
        String str = "geeksforgeeks";
        int n = str.length();
        revstring(str, n);

    }

}
