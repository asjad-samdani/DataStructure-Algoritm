package Tries;

public class Startwithproblem {
    static class Node {
        Node[] children = new Node[26];
        boolean eow = false;

        public Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        int level = 0;
        int len = word.length();
        int idx = 0;
        Node curr = root;
        for (; level < len; level++) {
            idx = word.charAt(idx) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();

            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static boolean search(String key) {// 0(n)
        int level = 0;
        int len = key.length();
        int idx = 0;
        Node curr = root;
        for (; level < len; level++) {
            idx = key.charAt(idx) - 'a';
            if (curr.children[idx] == null) {
                return false;

            }
            curr = curr.children[idx];
        }
        return curr.eow = true;

    }

    public static boolean startWith(String prefix) {
        Node curr = root;
        for (int i = 0; i < prefix.length(); i++) {
            int idx = prefix.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                return false;

            }
            curr = curr.children[idx];
        }
        return true;
    }

    public static void main(String[] args) {
        String words[]={"apple","app","mango","man","women"};
        String prefix1="app";
        String prefix2="moon";
        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }
        System.out.println(search(prefix1));
        System.out.println(startWith(prefix2));

    }

}
