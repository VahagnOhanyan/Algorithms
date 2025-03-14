package org.example.tree;

import java.util.*;

public class BinaryTreeZigzagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        if (root == null) return result;
        Deque<TreeNode> deque = new LinkedList<>();
        deque.add(root);
        boolean rightDirection = true;
        result.add(List.of(root.val));
        while (!deque.isEmpty()) {
            int size = deque.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode r = rightDirection ? deque.remove() : deque.removeLast();
                if (r != null) {
                    TreeNode start = rightDirection ? r.right : r.left;
                    TreeNode end = rightDirection ? r.left : r.right;
                    if (start != null) {
                        if (rightDirection) {
                            deque.add(start);
                        } else {
                            deque.offerFirst(start);
                        }
                        list.add(start.val);
                    }
                    if (end != null) {
                        if (rightDirection) {
                            deque.add(end);
                        } else {
                            deque.offerFirst(end);
                        }
                        list.add(end.val);

                    }
                }

            }
            rightDirection = !rightDirection;
            if (!list.isEmpty()) {
                result.add(list);
            }

        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode node5 = new TreeNode(5);
        TreeNode node4 = new TreeNode(4);

        // Intermediate nodes
        TreeNode node2 = new TreeNode(2, null, node5);
        TreeNode node3 = new TreeNode(3, null, node4);

        // Root node
        TreeNode root = new TreeNode(1, node2, node3);
        BinaryTreeZigzagLevelOrderTraversal tree = new BinaryTreeZigzagLevelOrderTraversal();
        System.out.println(tree.zigzagLevelOrder(root));
    }
}
