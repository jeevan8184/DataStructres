package AllGraphs;

public class sequence {
    public static void subsequences(String str, int idx, String newString) {

        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        // add
        char currChar = str.charAt(idx);
        subsequences(str, idx + 1, newString + currChar);
        // not add
        subsequences(str, idx + 1, newString);

    }

    public static void main(String args[]) {
        String str = "abc";
        subsequences(str, 0, " ");
    }

}
