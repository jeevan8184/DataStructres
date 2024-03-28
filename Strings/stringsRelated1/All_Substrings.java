package stringsRelated1;

public class All_Substrings {
    public static void Substrings(String str, int n) {
        for (int i = 0; i < n; i++) {
            String sub = " ";
            for (int j = i; j < n; j++) {
                sub += str.charAt(j);
                System.out.println(sub);
            }

        }

    }
    /*
     * time : O(n^2);
     * space : O(n);
     * 
     * total no of substrings=n*(n+1)/2
     */

    public static void main(String args[]) {
        String str = "abcd";
        int n = str.length();
        Substrings(str, n);

    }
}
