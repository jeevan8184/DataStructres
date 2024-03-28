package stringsRelated4;

public class L_R_rotation {
    public static String leftRotate(String str, int d) {
        String ans = str.substring(d) + str.substring(0, d);
        return ans;
    }

    public static String rightRotate(String str, int d) {
        // return leftRotate(str, str.length() - 1);
        String ans = str.substring(0, str.length() - d) + str.substring(0, str.length() - d);
        return ans;

    }
    /*
     * time : O(N) ; where N is length of string
     * space : O(1);
     */

    public static void main(String args[]) {
        String str = "GeeksforGeeks";
        int d = 2;
        System.out.println(leftRotate(str, d));
        System.out.println(rightRotate(str, d));

    }

}
