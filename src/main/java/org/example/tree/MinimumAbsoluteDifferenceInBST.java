package org.example.tree;

import java.util.LinkedList;
import java.util.Queue;

public class MinimumAbsoluteDifferenceInBST {
    public int getMinimumDifference(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int min = Integer.MAX_VALUE;
        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();
            if (node.right != null) {
                queue.add(node.right);
            }
            if (node.left != null) {
                queue.add(node.left);
            }
            min = Math.min(min, Math.min(getTheLeftest(node.right, node.val), getTheRightest(node.left, node.val)));
        }

        return min;
    }

    private int getTheRightest(TreeNode node, int val) {
        if (node == null) return Integer.MAX_VALUE;
        while (node.right != null) {
           node = node.right;
        }
        return Math.abs(val - node.val);
    }

    private int getTheLeftest(TreeNode node, int val) {
        if (node == null) return Integer.MAX_VALUE;
        while (node.left != null) {
            node = node.left;
        }
        return Math.abs(val - node.val);
    }


    public static void main(String[] args) {
        TreeNode node519 = new TreeNode(519);

        // Intermediate nodes
        TreeNode node1277 = new TreeNode(1277, node519, null);
        TreeNode node2776 = new TreeNode(2776);
        TreeNode node2236 = new TreeNode(2236, node1277, node2776);

        // Root node
        TreeNode root = new TreeNode(0, null, node2236);

        MinimumAbsoluteDifferenceInBST tree = new MinimumAbsoluteDifferenceInBST();
        System.out.println(tree.getMinimumDifference(root));
    }

}
