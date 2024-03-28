package stringsRelated1;

public class CAML_CASE1 {
    public static String Capital(String str) {

        char arr[] = str.toCharArray();
        int n = str.length();
        int cnt = 0;
        int idx = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                cnt++;
                arr[i + 1] = Character.toUpperCase(str.charAt(i + 1));
                continue;
            }
            arr[idx++] = arr[i];
        }
        return new String(arr, 0, n - cnt);
    }
    /*
     * time : O(n);
     * space : O(1);s
     */

    public static void main(String args[]) {
        String str = "I got intern at microsoft";
        System.out.println(Capital(str));
    }

}
