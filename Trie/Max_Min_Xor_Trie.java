package Advance_topicDSA.Trie;

public class Max_Min_Xor_Trie {
    static class TrieNode {
        TrieNode children[];

        TrieNode() {
            children = new TrieNode[2];
        }
    }

    public static void insert(TrieNode root, int num) {
        TrieNode curr = root;
        for (int i = 31; i >= 0; i--) {
            int bit = (num >> i) & 1;
            if (curr.children[bit] == null) {
                curr.children[bit] = new TrieNode();
            }
            curr = curr.children[bit];
        }
    }

    public static int findMaxXor(TrieNode root, int num) {
        TrieNode curr = root;
        int maxXor = 0;
        for (int i = 31; i >= 0; i--) {
            int bit = (num >> i) & 1;
            int toggledBit = 1 - bit;
            if (curr.children[toggledBit] != null) {
                maxXor |= (1 << i);
                curr = curr.children[toggledBit];
            } else {
                curr = curr.children[bit];
            }
        }
        return maxXor;
    }

    public static int findMinXor(TrieNode root, int num) {
        TrieNode curr = root;
        int minXor = 0;
        for (int i = 31; i >= 0; i--) {
            int bit = (num >> i) & 1;
            if (curr.children[bit] != null) {
                curr = curr.children[bit];
            } else {
                minXor |= (1 << i);
                curr = curr.children[1 - bit];
            }
        }
        return minXor;
    }

    public static void main(String[] args) {
        TrieNode root = new TrieNode();
        int nums[] = {3, 10, 5, 25, 2, 8};
        int maxXor = 6;
        int MinXor = 20;
        for (int i = 0; i < nums.length; i++) {
            insert(root, nums[i]);
        }

        System.out.println("Trie for Max_Min_Xor_Trie created successfully.");
        System.out.println("Max XOR: " + findMaxXor(root, maxXor));
        System.out.println("Max XOR: " + findMinXor(root, MinXor));
    }
}
