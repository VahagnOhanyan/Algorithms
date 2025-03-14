package org.example.tree;

import com.sun.source.tree.Tree;

import java.util.*;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingInt;

public class DeepestLeavesSum {
    public int deepestLeavesSum(TreeNode root) {
        Map<Integer, Integer> map = new HashMap<>();
        if (root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int deep = 0;
        int max = 0;
        while (!queue.isEmpty()) {
            deep++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode r = queue.remove();
                if (r.right != null) {
                    queue.add(r.right);
                }
                if (r.left != null) {
                    queue.add(r.left);
                }
                if (r.right == null && r.left == null) {
                    map.put(deep, map.getOrDefault(deep, 0) + r.val);
                    max = Math.max(max, deep);
                }

            }

        }
        return map.get(deep);
    }

    public static void main(String[] args) {
        TreeNode node5 = new TreeNode(5);
        TreeNode node4 = new TreeNode(4);

        // Intermediate nodes
        TreeNode node2 = new TreeNode(2, null, node5);
        TreeNode node3 = new TreeNode(3, null, node4);

        // Root node
        TreeNode root = new TreeNode(1, node2, node3);
        DeepestLeavesSum tree = new DeepestLeavesSum();
        System.out.println(tree.deepestLeavesSum(root));
    }

    class Pair<K, V> {
        K key;
        V value;

        Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }
}
