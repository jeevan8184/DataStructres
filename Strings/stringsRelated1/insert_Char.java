package stringsRelated1;

public class insert_Char {
    public static String addStars(String str, int chars[]) {
        String ans = " ";
        int j = 0;
        for (int i = 0; i < str.length(); i++) {

            if (j < chars.length && i == chars[j]) {
                ans += "*";
                j++;
            }
            ans += str.charAt(i);
        }
        return ans;
    }
    /*
     * time : O(N);
     * space : O(N);
     */

    public static void main(String args[]) {
        String str = "geeksforgeeks";
        int chars[] = { 1, 5, 7, 9 };
        str = addStars(str, chars);
        System.out.println(str);

    }

}
