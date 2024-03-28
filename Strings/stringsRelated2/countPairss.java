package stringsRelated2;

public class countPairss {
    public static int countPa(String str, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }

            }
        }
        return count;
    }

    /*
     * time : O(n^2);
     * space : O(1);
     */
    public static void main(String args[]) {
        String str = "geeksforgeeks";
        int n = str.length();
        System.out.println(countPa(str, n));
    }

}
