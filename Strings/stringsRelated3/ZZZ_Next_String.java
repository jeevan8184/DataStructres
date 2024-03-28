package stringsRelated3;

public class ZZZ_Next_String {
    public static String nextLetter(String str) {
        if (str == " ") {
            return "a";
        }
        int i = str.length() - 1;
        while (str.charAt(i) == 'z' && i >= 0) {
            i--;
            if (i == -1) {
                str += "a";
            } else {
                str = str.substring(0, i) + ((char) ((int) (str.charAt(i)) + 1)) + str.substring(i + 1);
            }
        }
        return str;
    }
    /*
     * time : O(n);
     * space : O(1);
     */

    public static void main(String args[]) {
        String str = "raavz";
        System.out.println(nextLetter(str));
    }

}
