package community_questions;

public class kthLargetNum {
    public static void main(String[] args) {
        int l = -10;
        int r = 28;
        int k = 5;
        int ans;
        int x;
        if (r % 2 == 0) {
            r = r - 1;
        }
        ans = r - 2 * (k - 1);
        if (ans < l) {
            System.out.println(0);
        } else {
            System.out.println(ans);
        }
    }
}
