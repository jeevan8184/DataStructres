package stringsRelated2;

public class Sort_String1 {
    static int MAX = 26;

    public static void sort(String str, int n) {
        int arr[] = new int[MAX];
        // char arr[] = str.toCharArray();
        for (int i = 0; i < n; i++) {
            arr[str.charAt(i) - 'a']++;
        }
        for (int i = 0; i < MAX; i++) {
            if (arr[i] == 0)
                continue;
            System.out.print((char) (i + 'a'));
        }

    }
    /*
     * time :O(n);
     * space : O(1);
     */

    public static void main(String args[]) {
        String str = "geeksforgeeks";
        int n = str.length();
        sort(str, n);
    }
}
