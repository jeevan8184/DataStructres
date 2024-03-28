package Strings.stringsPalin;

public class Rotate_Palindrome_St {
    public static boolean isPalindrome(String str) {

        int l = 0;
        int h = str.length() - 1;
        while (l < h) {
            if (str.charAt(l++) != str.charAt(h--)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isRotated(String str) {
        if (isPalindrome(str)) {
            return true;
        }
        for (int i = 0; i < str.length(); i++) {
            String str1 = str.substring(i + 1) + str.substring(0, i + 1);

            if (isPalindrome(str1)) {
                return true;
            }
        }
        return false;
    }

    /*
     * time : O(n^2);
     * space : O(n);
     */
    public static void main(String args[]) {
        System.out.println(isRotated("abcde") ? 1 : 0);

    }

}
