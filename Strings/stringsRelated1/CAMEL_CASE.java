package stringsRelated1;

public class CAMEL_CASE {
    public static String Captital(String str) {
        int i = 0;
        while (true) {
            i = 0;
            while (i < str.length()) {
                if (str.charAt(i) == ' ') {
                    char nextChar = Character.toLowerCase(str.charAt(i + 1));
                    str = str.substring(0, i) + nextChar + str.substring(i + 2);
                    break;
                }
                i++;
            }
            if (i == str.length())

                break;

        }
        return str;
    }
    /*
     * time : O(n^2);
     * space : O(1);
     */

    public static void main(String args[]) {
        String str = "i got intern At Microsoft";
        System.out.println(Captital(str));

    }

}
