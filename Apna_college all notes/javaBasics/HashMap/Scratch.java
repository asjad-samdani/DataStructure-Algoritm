package HashMap;

import java.util.*;

public class Scratch {
    static class HashMap<k, v> { // Generic (General for all data types)
        class Node {
            k key;
            v value;

            public Node(k key, v value) {
                this.key = key;
                this.value = value;
            }

        }

        private int n;// n Total no of nodes in a linklist
        private int N;
        private LinkedList<Node> buckets[];// N Linklist in array || Array of LinkList || N-> Buckets.length

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4; // ArraySize
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }

        }

        private int hashFuncation(k key) {
            int hc = key.hashCode();
            return Math.abs(hc) % N;
        }

        private int searchInll(k key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            int di = 0;

            // for (int i = 0; i < ll.size(); i++) {
            // Node node = ll.get(i);
            // if (node.key == key) {
            // return di;

            // }
            for (Node node : ll) {
                if (node.key.equals(key)) {
                    return di;
                }
                di++;

            }
            return -1;

        }

        @SuppressWarnings("unchecked")

        private void rehash() {
            LinkedList<Node> oldBucket[] = buckets;
            buckets = new LinkedList[N * 2];
            N = 2 * N;
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }
            // nodes -> add in buckets
            for (int i = 0; i < oldBucket.length; i++) {
                LinkedList<Node> ll = oldBucket[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }
        }

        public void put(k key, v value) {
            int bi = hashFuncation(key); // 0 to 3
            int di = searchInll(key, bi);// valid -1
            if (di != -1) {
                Node node = buckets[bi].get(di);
                node.value = value;

            } else {
                buckets[bi].add(new Node(key, value));
                n++;
            }
            double lambda = (double) n / N;
            if (lambda > 2.0) {
                rehash();
            }
        }

        public boolean containsKey(k key) {
            int bi = hashFuncation(key); // 0 to 3
            int di = searchInll(key, bi);// valid -1
            if (di != -1) {
                return true;

            } else {
                return false;

            }
        }

        public v remove(k key) {
            int bi = hashFuncation(key); // 0 to 3
            int di = searchInll(key, bi);// valid -1
            if (di != -1) {
                Node node = buckets[bi].remove(di);
                return node.value;
            } else {
                return null;
            }
        }

        public v get(k key) {
            int bi = hashFuncation(key); // 0 to 3
            int di = searchInll(key, bi);// valid -1
            if (di != -1) {
                Node node = buckets[bi].get(di);
                return node.value;

            } else {
                return null;
            }
        }

        public ArrayList<k> keySet() {
            ArrayList<k> keys = new ArrayList<>();
            for (int i = 0; i < buckets.length; i++) {
                LinkedList<Node> ll = buckets[i];
                for (Node node : ll) {
                    keys.add(node.key);

                }
            }
            return keys;
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Asjad", 100);

        hm.put("India", 10);
        hm.put("Pakistan", 120);
        hm.put("Bangladesh", 130);
        ArrayList<String> keys = hm.keySet();
        for (String key : keys) {
            System.out.println(key);

        }
        System.out.println(hm.get("Asjad"));
        System.out.println(hm.remove("Asjad"));
        System.out.println(hm.get("Asjad"));

    }

}
