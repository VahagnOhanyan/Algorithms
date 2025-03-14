package org.example.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaximumDifferenceBetweenNodeAndAncestor {

    static List<Integer> list = new ArrayList<>();
     int diff = 0;

    public  int maxAncestorDiff(TreeNode root) {
        if (root == null) return 0;
        return getNodesToLeafMaxAndMin(root, root.val, root.val);


    }

    private  int getNodesToLeafMaxAndMin(TreeNode root, int max, int min) {
        if (root == null) return 0;
        max = Math.max(max, root.val);
        min = Math.min(min, root.val);
        diff = Math.max(diff, Math.abs(max - min));
        // list.add(diff);
        getNodesToLeafMaxAndMin(root.left, max, min);
        getNodesToLeafMaxAndMin(root.right, max, min);
        //Collections.sort(list);
        return diff;//list.get(list.size() - 1);

    }

    public static void main(String[] args) {
        MaximumDifferenceBetweenNodeAndAncestor m = new MaximumDifferenceBetweenNodeAndAncestor();
        TreeNode node1 = new TreeNode(1);
        TreeNode node4 = new TreeNode(4);
        TreeNode node7 = new TreeNode(7);
        TreeNode node13 = new TreeNode(13);
        TreeNode node14 = new TreeNode(14, node13, null);

        // Intermediate nodes
        TreeNode node6 = new TreeNode(6, node4, node7);
        TreeNode node3 = new TreeNode(3, node1, node6);
        TreeNode node10 = new TreeNode(10, null, node14);

        // Root node
        TreeNode root = new TreeNode(8, node3, node10);

        System.out.println(m.maxAncestorDiff(root));
    }
}
