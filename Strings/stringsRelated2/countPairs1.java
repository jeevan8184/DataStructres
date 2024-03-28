package stringsRelated2;

public class countPairs1 {
    static int MAX = 256;

    public static int count(String str) {
        int cnt[] = new int[MAX];
        int ans = 0;

        for (int i = 0; i < str.length(); i++) {
            cnt[str.charAt(i)]++;
        }
        for (int i = 0; i < MAX; i++) {

            ans += cnt[i] * cnt[i];
        }
        return ans;
    }
    /*
     * time : O(n);
     * space : O(n);
     */

    public static void main(String args[]) {
        String str = "geeksforgeeks";
        // int n = str.length();
        System.out.println(count(str));
    }

}
