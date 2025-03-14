package org.example.tree;

import java.util.LinkedList;
import java.util.Queue;

public class InsertIntoABinarySearchTree {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        return null;


    }

    public static void main(String[] args) {
        TreeNode node5 = new TreeNode(5);
        TreeNode node4 = new TreeNode(4);

        // Intermediate nodes
        TreeNode node2 = new TreeNode(2, null, node5);
        TreeNode node3 = new TreeNode(3, null, node4);

        // Root node
        TreeNode root = new TreeNode(1, node2, node3);
        InsertIntoABinarySearchTree tree = new InsertIntoABinarySearchTree();
        int val = 7;
        System.out.println(tree.insertIntoBST(root, val));
    }
}
