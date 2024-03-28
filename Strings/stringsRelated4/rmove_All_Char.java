package stringsRelated4;

public class rmove_All_Char {
    public static void removElm(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);
        if (currChar == 'e') {
            removElm(str, idx + 1, newString);
        } else {
            removElm(str, idx + 1, newString + currChar);
        }

    }

    public static void main(String args[]) {
        String str = "geeksforgeeks";
        removElm(str, 0, " ");

    }

}
