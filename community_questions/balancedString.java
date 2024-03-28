package community_questions;

public class balancedString {
    public static void main(String[] args) {
        String str = "LRRRRLLRLLRL";
        int cnt = 0;
        int i = 0, j = 0;
        for (int k = 0; k < str.length(); k++) {
            if (str.charAt(k) == 'L') {
                i++;
            } else {
                j++;
            }
            if (i == j) {
                cnt++;
                i = 0;
                j = 0;
            }
        }
        System.out.println(cnt);
    }
}
