package stringsRelated1;

public class Replac_spaces1 {

    /*
     * time : O(n);
     * space : O(1);
     */
    public static void main(String args[]) {
        String str = "I got intern At microsoft";

        str = str.trim();
        //
        str = str.replaceAll("\s", "%20");
        System.out.println(str);

    }

}
