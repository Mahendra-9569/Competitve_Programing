package Advance_topicDSA.Trie;

public class number_Trie {
    static class TrieNode {
        TrieNode children[];
        boolean isEnd;

        TrieNode() {
            children = new TrieNode[10];
            isEnd = false;
        }
    }

    public static void insert(TrieNode root, String number) {
        TrieNode curr = root;
        for (int i = 0; i < number.length(); i++) {
            int idx = number.charAt(i) - '0';
            if (curr.children[idx] == null) {
                curr.children[idx] = new TrieNode();
            }
            curr = curr.children[idx];
        }
        curr.isEnd = true;
    }

    public static boolean search(TrieNode root, String number) {
        TrieNode curr = root;
        for (int i = 0; i < number.length(); i++) {
            int idx = number.charAt(i) - '0';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.isEnd;
    }

    public static void main(String[] args) {
        TrieNode root = new TrieNode();
        String numbers[] = {"123", "456", "789", "000", "321", "654"};
        for (int i = 0; i < numbers.length; i++) {
            insert(root, numbers[i]);
        }
        System.out.println(search(root, "123"));
        System.out.println(search(root, "456"));
        System.out.println(search(root, "789"));
        System.out.println(search(root, "000"));
    }
}
