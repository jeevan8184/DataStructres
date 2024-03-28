package Trie_data_structrue;

public class allPrefixes {
    static class Node {
        Node children[] = new Node[26];
        int frq;
        boolean eow = false;

        public Node() {
            for (int i = 0; i < 26; i++) {
                this.children[i] = null;
            }
            this.frq = 1;
        }
    }

    static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            } else {
                curr.children[idx].frq++;
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static void prefixes(Node root, String ans) {
        if (root == null) {
            return;
        }
        if (root.frq == 1) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null) {
                prefixes(root.children[i], ans + (char) (i + 'a'));
            }
        }
    }

    public static void main(String[] args) {
        String words[] = { "zebra", "dog", "duck", "dove" };
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        root.frq = 0;
        prefixes(root, "");
        System.out.println("Hello");
    }

}
