package org.example.tree;

public class SameTree {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        System.out.println(isSameTree(new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4,
                                new TreeNode(6, null, null),
                                new TreeNode(5)),
                        null),
                new TreeNode(3, null, null)), new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4,
                                new TreeNode(6, null, null),
                                new TreeNode(5)),
                        null),
                new TreeNode(1, null, null))));
    }
}
