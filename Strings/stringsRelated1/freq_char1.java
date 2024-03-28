package stringsRelated1;

public class freq_char1 {
    public static void frequency(String str, int n, int i, char letter, int count[]) {
        if (i > n - 1) {
            return;
        }
        if (str.charAt(i) == letter) {
            count[0]++;
        }
        frequency(str, n, i + 1, letter, count);
    }
    /*
     * time : O(n);
     * space : O(1);
     */

    public static void main(String args[]) {
        String str = "geeksforgeeks";
        int n = str.length();
        for (char letter = 'a'; letter <= 'z'; letter++) {
            int count[] = { 0 };
            frequency(str, n, 0, letter, count);
            if (count[0] == 0) {
                continue;
            }
            System.out.print(letter + "" + count[0]);
        }
    }

}
