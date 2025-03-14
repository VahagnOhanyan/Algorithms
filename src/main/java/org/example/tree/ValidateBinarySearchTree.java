package org.example.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ValidateBinarySearchTree {
    private boolean isValidBST(TreeNode root) {
        return dfs(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean dfs(TreeNode node, long small, long large) {
        if (node == null) {
            return true;
        }

        if (small >= node.val || node.val >= large) {
            return false;
        }

        boolean left = dfs(node.left, small, node.val);
        boolean right = dfs(node.right, node.val, large);
        return left && right;
    }


    public static void main(String[] args) {

        TreeNode node3 = new TreeNode(0);
        TreeNode node6 = new TreeNode(4);

        // Intermediate node
        TreeNode node4 = new TreeNode(8);

        // Root's left child
        TreeNode node1 = new TreeNode(1, node3, node6);

        // Root node
        TreeNode root = new TreeNode(5, node1, node4);

        ValidateBinarySearchTree tree = new ValidateBinarySearchTree();
        System.out.println(tree.isValidBST(root));
    }


}
