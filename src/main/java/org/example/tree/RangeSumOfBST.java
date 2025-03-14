package org.example.tree;

import java.util.LinkedList;
import java.util.Queue;

public class RangeSumOfBST {

    public int rangeSumBST(TreeNode root, int low, int high) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int sum = 0;
        while (!queue.isEmpty()) {
            TreeNode r = queue.remove();
            if (r.val >= low && r.val <= high) {
                sum += r.val;
            }
            if (r.right != null && r.val < high) {
                queue.add(r.right);
            }
            if (r.left != null && r.val > low) {
                queue.add(r.left);
            }

        }


        return sum;
    }

    public static void main(String[] args) {
        TreeNode node3 = new TreeNode(3);
        TreeNode node7 = new TreeNode(7);
        TreeNode node18 = new TreeNode(18);

        // Intermediate nodes
        TreeNode node5 = new TreeNode(5, node3, node7);
        TreeNode node15 = new TreeNode(15, null, node18);

        // Root node
        TreeNode root = new TreeNode(10, node5, node15);
        int low = 7;
        int high = 15;
        RangeSumOfBST tree = new RangeSumOfBST();
        System.out.println(tree.rangeSumBST(root, low, high));
    }
}
