package stringsRelated1;

public class freq_char2 {
    static int MAX = 26;

    public static void frequency(String str, int n) {
        int freq[] = new int[MAX];
        for (int i = 0; i < n; i++) {
            freq[str.charAt(i) - 'a']++;
        }
        for (int i = 0; i < MAX; i++) {
            if (freq[i] == 0)
                continue;

            System.out.print((char) (i + 'a') + "" + freq[i]);
        }
    }

    /*
     * time :O(N);
     * space :O(1);
     */
    public static void main(String args[]) {
        String str = "geeksforgeeks";
        int n = str.length();
        frequency(str, n);
    }
}
