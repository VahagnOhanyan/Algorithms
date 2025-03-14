package org.example.tree;

public class MinimumDepthOfBinaryTree {
    public static int minDepth(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;

        return 1 + Math.min((root.left == null ? Integer.MAX_VALUE : minDepth(root.left)), (root.right == null ? Integer.MAX_VALUE : minDepth(root.right)));
    }

    public static void main(String[] args) {
        System.out.println(minDepth(new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4,
                                new TreeNode(6, null, null),
                                new TreeNode(5)),
                        null),
                null)));
    }
}

