package Advance_topicDSA.SegmentTree;

public class Rnage_sum_Query {
    static int tree[];

    public static void buildTree(int nums[], int start, int end, int treeNode) {
        if (start == end) {
            tree[treeNode] = nums[start];
            return;
        }
        int mid = (start + end) / 2;
        buildTree(nums, start, mid, 2 * treeNode + 1);
        buildTree(nums, mid + 1, end, 2 * treeNode + 2);
        tree[treeNode] = tree[2 * treeNode + 1] + tree[2 * treeNode + 2];
    }

    public static int findQuery(int idx, int st, int ed, int qs, int qe) {
        if (qs > ed || qe < st) {
            return 0;
        }
        if (st >= qs && ed <= qe) {
            return tree[idx];
        } else {
            int mid = (st + ed) / 2;
            int left = findQuery(2 * idx + 1, st, mid, qs, qe);
            int right = findQuery(2 * idx + 2, mid + 1, ed, qs, qe);
            return left + right;
        }
    }

    public static void updateQuery(int idx, int st, int ed, int pos, int val) {
        if (pos < st || pos > ed) {
            return;
        }
        if (st == ed) {
            tree[idx] = val;
            return;
        }

        int mid = (st + ed) / 2;
        updateQuery(2 * idx + 1, st, mid, pos, val);
        updateQuery(2 * idx + 2, mid + 1, ed, pos, val);
        tree[idx] = tree[2 * idx + 1] + tree[2 * idx + 2];

    }

    public static void main(String[] args) {
        int nums[] = {1, 3, 4, 5, 6, 7, 8, 9, 10};
        tree = new int[4 * nums.length];
        buildTree(nums, 0, nums.length - 1, 0);
        System.out.println(findQuery(0, 0, nums.length - 1, 3, 7));

        updateQuery(0, 0, nums.length - 1, 3, 10);
        System.out.println(findQuery(0, 0, nums.length - 1, 3, 7));

    }
}
