package stringsRelated3;

public class swapSt {
    public static String swapElements(String s, int B, int C, int N) {

        C = C % N;

        char arr[] = s.toCharArray();
        for (int i = 0; i < B; i++) {
            // swap
            char temp = arr[i];
            arr[i] = arr[(i + C) % N];
            arr[(i + C) % N] = temp;
        }
        return new String(arr);

    }
    /*
     * time : O(B);
     * space :O(1);
     */

    public static void main(String args[]) {
        String s = "ABCDE";
        int N = s.length();
        int B = 4;
        int C = 4;
        s = swapElements(s, B, C, N);
        System.out.println(s);

    }

}
