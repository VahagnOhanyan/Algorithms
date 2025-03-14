package org.example.tree;

public class MaximumDepthOfBinaryTree {
    static int i = 0;

    public static int maxDepth(TreeNode root) {
        if (root == null) return 0;

        int i1 = maxDepth(root.left);

        int i2 = maxDepth(root.right);

        return Math.max(i1, i2) + 1;
    }

    public static void main(String[] args) {
        System.out.println(maxDepth(new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4,
                                new TreeNode(6, null, null),
                                new TreeNode(5)),
                        null),
                new TreeNode(3, null, null))));
    }
}
