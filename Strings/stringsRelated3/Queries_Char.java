package stringsRelated3;

public class Queries_Char {
    public static void query(String X, int i, int j) {
        int n = X.length();
        i = i % n;
        j = j % n;
        if (X.charAt(i) == X.charAt(j)) {
            System.out.println("yes");
        } else {
            System.out.println("No");
        }

    }
    /*
     * time :O(1);
     * space :O(1);
     */

    public static void main(String args[]) {
        String X = "geeksforgeeks";
        query(X, 0, 8);
        query(X, 8, 13);
        query(X, 6, 15);

    }

}
