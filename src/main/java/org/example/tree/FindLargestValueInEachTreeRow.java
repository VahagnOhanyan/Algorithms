package org.example.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FindLargestValueInEachTreeRow {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        if (root == null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int max = root.val;
        while (!queue.isEmpty()) {
            int size = queue.size();
            result.add(max);
            max = Integer.MIN_VALUE;
            for (int i = 0; i < size; i++) {
                TreeNode r = queue.remove();
                if (r.right != null) {
                    queue.add(r.right);
                }
                if (r.left != null) {
                    queue.add(r.left);
                }
                if (r.right == null && r.left == null) {
                    continue;
                }
                int val = r.right == null ? r.left.val :
                        (r.left == null ? r.right.val : Math.max(r.right.val, r.left.val));
                max = Math.max(max, val);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode node5 = new TreeNode(5);
        TreeNode node4 = new TreeNode(4);

        // Intermediate nodes
        TreeNode node2 = new TreeNode(2, null, node5);
        TreeNode node3 = new TreeNode(3, null, node4);

        // Root node
        TreeNode root = new TreeNode(1, node2, node3);
        FindLargestValueInEachTreeRow tree = new FindLargestValueInEachTreeRow();
        System.out.println(tree.largestValues(root));
    }
}
