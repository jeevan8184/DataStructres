package Maps;

import java.util.ArrayList;
import java.util.LinkedList;

public class hashMap_Implementation {
    static class HashMap<K, V> {
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n;// no of nodes
        private int N;// no of buckets
        private LinkedList<Node> buckets[];

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % this.N;
        }

        public int SearchInLL(K key, int bi) {
            LinkedList<Node> ll = this.buckets[bi];
            int di = 0;
            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);
                if (node.key == key) {
                    return di;
                }
                di++;
            }
            return -1;
        }

        public void rehash() {
            LinkedList<Node> oldBuck[] = this.buckets;
            this.buckets = new LinkedList[this.N * 2];
            this.N = 2 * this.N;
            for (int i = 0; i < this.buckets.length; i++) {
                this.buckets[i] = new LinkedList<>();
            }
            for (int i = 0; i < oldBuck.length; i++) {
                LinkedList<Node> ll = this.buckets[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(i);
                    this.put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value) {
            int bi = this.hashFunction(key);
            int di = this.SearchInLL(key, bi);

            if (di != -1) {
                Node node = this.buckets[bi].get(di);
                node.value = value;
            } else {
                this.buckets[bi].add(new Node(key, value));
            }
            double lamda = (double) this.n / this.N;
            if (lamda > 2.0) {
                this.rehash();
            }
        }

        public boolean containsKey(K key) {
            int bi = this.hashFunction(key);
            int di = this.SearchInLL(key, bi);

            if (di != -1) {
                return true;
            } else {
                return false;
            }
        }

        public V remove(K key) {
            int bi = this.hashFunction(key);
            int di = this.SearchInLL(key, bi);

            if (di != -1) {
                Node node = this.buckets[bi].remove(di);
                this.n--;
                return node.value;
            } else {
                return null;
            }
        }

        public V get(K key) {
            int bi = this.hashFunction(key);
            int di = this.SearchInLL(key, bi);

            if (di != -1) {
                Node node = this.buckets[bi].get(di);
                return node.value;
            } else {
                return null;
            }
        }

        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();
            for (int i = 0; i < this.buckets.length; i++) {
                LinkedList<Node> ll = this.buckets[i];
                for (Node node : ll) {
                    keys.add(node.key);
                }
            }
            return keys;
        }

    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);
        ArrayList<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key);
        }
        System.out.println(map.get("A"));
        System.out.println(map.remove("A"));
        System.out.println(map.get("A"));

    }
}
