package Trie_data_structrue;

public class insertion {
    static class Node {
        Node[] children;
        boolean eow;

        public Node() {
            this.children = new Node[26];
            for (int i = 0; i < 26; i++) {
                this.children[i] = null;
            }
            this.eow = false;
        }
    }

    static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static boolean search(String key) {
        Node curr = root;
        for (int i = 0; i < key.length(); i++) {
            int idx = key.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            if (i == key.length() - 1 && curr.children[idx].eow == false) {
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }

    public static boolean wordBreak(String key) {
        if (key.length() == 0) {
            return true;
        }
        for (int i = 1; i <= key.length(); i++) {
            String str1 = key.substring(0, i);
            String str2 = key.substring(i);
            if (search(str1) && wordBreak(str2)) {
                return true;
            }

        }
        return false;
    }

    public static String ans = "";

    public static void largestPrefix(Node root, StringBuilder temp) {
        if (root == null) {
            return;
        }
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null && root.children[i].eow == true) {
                temp.append((char) (i + 'a'));
                if (temp.length() > ans.length()) {
                    ans = temp.toString();
                }
                largestPrefix(root.children[i], temp);
                temp.deleteCharAt(temp.length() - 1);
            }
        }
    }

    public static boolean startsWith(String key) {
        Node curr = root;
        for (int i = 0; i < key.length(); i++) {
            int idx = key.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }

    public static int countStrings(Node root) {
        if (root == null) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null) {
                count += countStrings(root.children[i]);
            }
        }
        return count + 1;
    }

    public static void main(String[] args) {
        String words[] = { "a", "ap", "app", "appl", "apple", "apply", "banana" };
        String key = "ilikesamsung";
        String str = "apple";
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        for (int i = 0; i < str.length(); i++) {
            String suffix = str.substring(i);
            insert(suffix);
        }

        System.out.println(search("sam"));
        System.out.println(wordBreak(key));
        System.out.println(startsWith("likes"));
        System.out.println(countStrings(root));
        largestPrefix(root, new StringBuilder(""));
        System.out.println(ans);

    }
}
