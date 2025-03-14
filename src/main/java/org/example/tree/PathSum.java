package org.example.tree;

public class PathSum {


    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        if (targetSum - root.val == 0 && root.left == null && root.right == null) return true;
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }


    public static void main(String[] args) {
        System.out.println(hasPathSum(new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4,
                                new TreeNode(6, null, null),
                                new TreeNode(5)),
                        null),
                new TreeNode(3, null, null)), 11));
    }
}
