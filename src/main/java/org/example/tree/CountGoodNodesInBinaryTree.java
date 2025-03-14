package org.example.tree;

public class CountGoodNodesInBinaryTree {

    public int goodNodes(TreeNode root) {
        return countNodes(root, root.val);
    }

    public int countNodes(TreeNode root, int v) {
        if (root == null) return 0;
        if (root.val >= v) {
            v = root.val;
            return countNodes(root.left, v) + countNodes(root.right, v) + 1;
        } else {
            return countNodes(root.left, v) + countNodes(root.right, v);
        }
    }

    public static void main(String[] args) {
        CountGoodNodesInBinaryTree tree = new CountGoodNodesInBinaryTree();
        System.out.println(tree.goodNodes(
                new TreeNode(1,
                new TreeNode(2, new TreeNode(4, new TreeNode(3), new TreeNode(1)), null),
                new TreeNode(3))));
    }
}
