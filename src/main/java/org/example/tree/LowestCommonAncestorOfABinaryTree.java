package org.example.tree;

public class LowestCommonAncestorOfABinaryTree {

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;

        TreeNode found = lowestCommonAncestor(root.left, p, q);
        TreeNode found2 = lowestCommonAncestor(root.right, p, q);

        if ((found != null && (found.val == p.val || found.val == q.val) ||
                found2 != null && (found2.val == p.val || found2.val == q.val)) && (root.val == p.val || root.val == q.val)) {
            return root;
        }

        if ((found != null && found2 != null && found.val == p.val && found2.val == q.val) ||
                (found != null && found2 != null && found.val == q.val && found2.val == p.val)) {
            return root;
        }
        if (root.val == p.val || root.val == q.val) {
            return root;
        }
        if(found !=null){
            return found;
        }
        return found2;
    }

    public static void main(String[] args) {
        System.out.println(lowestCommonAncestor(new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4,
                                new TreeNode(6, null, null),
                                new TreeNode(5)),
                        null),
                new TreeNode(3, null, null)), new TreeNode(1), new TreeNode(2)).val);
    }
}
