package stringsRelated2;

public class WildCard_Char {
    public static void print(char str[], int idx) {
        if (idx == str.length) {
            System.out.println(str);
            return;
        }

        if (str[idx] == '?') {

            str[idx] = '0';
            print(str, idx + 1);

            str[idx] = '1';
            print(str, idx + 1);
            // backtracking
            str[idx] = '?';
        } else {
            print(str, idx + 1);
        }

    }
    /*
     * time : O(2^N); as there are two possibilities;
     * space : O(N^2) as a copy of the string is created
     * in every recursive call
     */

    public static void main(String args[]) {
        String input = "1??0?101";
        char str[] = input.toCharArray();

        print(str, 0);

    }

}
