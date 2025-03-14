package org.example.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}


public class AllNodesDistanceKInBinaryTree {
    List<Integer> list = new ArrayList<>();
    Map<TreeNode, TreeNode> parent;

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        parent = new HashMap<>();
        addParent(root, null);
        dfs(target, k, 0);
        return list;
    }

    private void addParent(TreeNode cur, TreeNode parent) {
        if (cur != null) {
            this.parent.put(cur, parent);
            addParent(cur.left, cur);
            addParent(cur.right, cur);
        }
    }

    private void dfs(TreeNode node,  int k, int count) {


    }


    public static void main(String[] args) {
// Array representing the tree: [3,5,1,6,2,0,8,null,null,7,4]
        Integer[] values = {3, 5, 1, 6, 2, 0, 8, null, null, 7, 4};

        // Create the tree manually based on the array (level-order)
        TreeNode root = new TreeNode(values[0]); // Root is 3

        // Level 1
        root.left = new TreeNode(values[1]);  // 5
        root.right = new TreeNode(values[2]); // 1

        // Level 2
        root.left.left = new TreeNode(values[3]);   // 6
        root.left.right = new TreeNode(values[4]);  // 2
        root.right.left = new TreeNode(values[5]);  // 0
        root.right.right = new TreeNode(values[6]); // 8

        // Level 3
        root.left.right.left = new TreeNode(values[9]);  // 7
        root.left.right.right = new TreeNode(values[10]); //
        AllNodesDistanceKInBinaryTree allNodesDistanceKInBinaryTree = new AllNodesDistanceKInBinaryTree();
        System.out.println(allNodesDistanceKInBinaryTree.distanceK(root, root.right.left, 2));

    }
}


