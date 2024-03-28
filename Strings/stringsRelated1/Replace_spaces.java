package stringsRelated1;

public class Replace_spaces {
    public static String replace(String str, String newString) {

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                newString += "%20";
            } else {
                newString += str.charAt(i);
            }
        }
        return newString;
    }
    /*
     * time :O(n^2);
     * space : O(1);
     * 
     */

    public static void main(String args[]) {

        String str = "Mr John Smith";
        System.out.println(replace(str, " "));

    }

}
