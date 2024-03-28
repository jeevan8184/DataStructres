package Strings.stringsPalin;

public class Min_Char_Palindrome {
    public static int findPalindrome(String str) {
        int n = str.length();
        int start = 0;
        int end = n - 1;
        int res = 0;

        while (start < end) {
            if (str.charAt(start) == str.charAt(end)) {
                start++;
                end--;

            } else {
                res++;
                start = 0;
                end = n - 1 - res;
            }
        }
        return res;
    }
    /*
     * time : O(n);
     * space :O(1);
     */

    public static void main(String args[]) {
        String str = "AACECAAAA";
        System.out.println(findPalindrome(str));

    }

}
