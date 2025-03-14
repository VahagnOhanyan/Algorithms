package org.example.tree;

public class DiameterOfBinaryTree {
    int max = 0;
    int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        countNodes(root);
        return diameter;

    }

    private int countNodes(TreeNode root) {
        if (root == null) return 0;
        int l = countNodes(root.left);
        int r = countNodes(root.right);
        diameter = Math.max(diameter, l + r);
        max = Math.max(l, r) + 1;
        return max;
    }


    public static void main(String[] args) {
        DiameterOfBinaryTree tree = new DiameterOfBinaryTree();
        TreeNode node1 = new TreeNode(1);
        TreeNode node4 = new TreeNode(4);
        //  TreeNode node5 = new TreeNode(5);
        TreeNode node7 = new TreeNode(7, null, null);

        TreeNode node13 = new TreeNode(13);
        TreeNode node14 = new TreeNode(14, node13, null);

        // Intermediate nodes
        TreeNode node6 = new TreeNode(6, node4, node7);
        //   TreeNode node3 = new TreeNode(3, node1, node6);
        TreeNode node3 = new TreeNode(3, null, null);
        TreeNode node10 = new TreeNode(10, null, node14);

        // Root node
        TreeNode root = new TreeNode(8, node3, null);

        System.out.println(tree.diameterOfBinaryTree(root));

    }
}
