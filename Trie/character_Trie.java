package Advance_topicDSA.Trie;

public class character_Trie {
    static class TrieNode {
        TrieNode children[];
        boolean isEnd;

        TrieNode() {
            children = new TrieNode[26];
            isEnd = false;
        }
    }

    public static void insert(TrieNode root, String word) {
        TrieNode curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new TrieNode();
            }
            curr = curr.children[idx];
        }
        curr.isEnd = true;
    }

    public static boolean search(TrieNode root, String word) {
        TrieNode curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.isEnd;
    }

    public static void main(String[] args) {
        String words[] = {"apple", "app", "bat", "ball", "batman"};
        TrieNode root = new TrieNode();
        for (int i = 0; i < words.length; i++) {
            insert(root, words[i]);
        }
        System.out.println(search(root, "bat"));
        System.out.println(search(root, "batman"));
        System.out.println(search(root, "app"));
        System.out.println(search(root, "apple"));
        System.out.println(search(root, "bats"));
    }
}
