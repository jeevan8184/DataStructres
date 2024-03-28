package Strings.stringsPalin;

public class Min_Char_Palindrome1 {
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

    public static void main(String args[]) {
        String str = "AACECAAAA";
        int cnt = 0;
        int flag = 0;
        while (str.length() > 0) {
            if (isPalindrome(str)) {
                flag = 1;
                break;
            } else {
                cnt++;

                str = str.substring(0, str.length() - 1);
            }
        }
        if (flag == 1) {
            System.out.println(cnt);
        }
    }

}
