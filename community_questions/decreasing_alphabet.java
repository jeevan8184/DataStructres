package community_questions;

public class decreasing_alphabet {
    public static void main(String[] args) {
        int n = 5;
        int k = 85;
        String ans = "";
        int kk = k - n;
        for (int i = n - 1; i >= 0; i--) {
            if (kk >= 25) {
                kk -= 25;
                ans += 'z';
            } else {
                ans += (char) (kk + 'a');
                kk -= kk;
            }
        }
        String res = "";
        for (int i = ans.length() - 1; i >= 0; i--) {
            res += ans.charAt(i);
        }
        System.out.println(res);
    }
}
