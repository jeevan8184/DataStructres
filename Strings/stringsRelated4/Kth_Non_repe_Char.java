package stringsRelated4;

public class Kth_Non_repe_Char {
    public static void nonrepeating(String str, int n, int k, String ans) {

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (str.charAt(i) != str.charAt(j)) {
                    ans += str.charAt(i);
                }
            }
        }
        // System.out.println(ans);

    }
dfghjk
zx
cvbn
    public static void main(String args[]) {
        String str = "geeksforgeeks";
        int k = 2;
        int n = str.length();
        nonrepeating(str, n, k, " ");

    }

}
