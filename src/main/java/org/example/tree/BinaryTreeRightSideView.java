package org.example.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        if (root == null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            result.add(queue.peek().val);
            for (int i = 0; i < size; i++) {
                TreeNode r = queue.remove();
                if (r.right != null) {
                    queue.add(r.right);
                }
                if (r.left != null) {
                    queue.add(r.left);
                }

            }

        }
        return result;
    }

    public static void main(String[] args) {
        // Leaf nodes
        TreeNode node5 = new TreeNode(5);
        TreeNode node4 = new TreeNode(4);

        // Intermediate nodes
        TreeNode node2 = new TreeNode(2, null, node5);
        TreeNode node3 = new TreeNode(3, null, node4);

        // Root node
        TreeNode root = new TreeNode(1, node2, node3);
        BinaryTreeRightSideView tree = new BinaryTreeRightSideView();
        System.out.println(tree.rightSideView(root));
    }
}
