package org.example.tree;

public class ClosestBinarySearchTreeValue {
    double min = Integer.MAX_VALUE;
    double prevMin = Integer.MAX_VALUE;
    int val;

    public int closestValue(TreeNode root, double target) {
        if (root == null) return 0;
        if (Math.abs(root.val - target) == min) {
            val = Math.min(val, root.val);
        }
        if (root.val > target) {
            min = Math.min(min, Math.abs(root.val - target));
            if (min != prevMin) {
                val = root.val;
                prevMin = min;
            }
            if (root.left != null) {
                closestValue(root.left, target);
            }
        } else if (root.val < target) {
            min = Math.min(min, Math.abs(root.val - target));
            if (min != prevMin) {
                val = root.val;
                prevMin = min;
            }
            if (root.right != null) {
                closestValue(root.right, target);
            }
        } else {
            val = root.val;
        }
        return val;
    }


    public static void main(String[] args) {
        ClosestBinarySearchTreeValue tree = new ClosestBinarySearchTreeValue();

        TreeNode root = new TreeNode(28,
                new TreeNode(12,
                        new TreeNode(4,
                                new TreeNode(2,
                                        new TreeNode(0,
                                                null,
                                                new TreeNode(1)),
                                        new TreeNode(3)),
                                new TreeNode(9,
                                        new TreeNode(8,
                                                new TreeNode(7,
                                                        new TreeNode(6),
                                                        null),
                                                null),
                                        new TreeNode(11,
                                                new TreeNode(10),
                                                null))),
                        new TreeNode(24,
                                new TreeNode(14,
                                        new TreeNode(13),
                                        new TreeNode(20,
                                                new TreeNode(17,
                                                        new TreeNode(16,
                                                                new TreeNode(15),
                                                                null),
                                                        new TreeNode(18,
                                                                null,
                                                                new TreeNode(19))),
                                                new TreeNode(22,
                                                        new TreeNode(21),
                                                        new TreeNode(23)))),
                                new TreeNode(25,
                                        null,
                                        new TreeNode(26,
                                                null,
                                                new TreeNode(27))))),
                new TreeNode(45,
                        new TreeNode(35,
                                new TreeNode(31,
                                        new TreeNode(30,
                                                new TreeNode(29),
                                                null),
                                        new TreeNode(33,
                                                new TreeNode(32),
                                                new TreeNode(34))),
                                new TreeNode(42,
                                        new TreeNode(41,
                                                new TreeNode(40,
                                                        new TreeNode(39,
                                                                new TreeNode(38),
                                                                null),
                                                        null),
                                                null),
                                        new TreeNode(43,
                                                null,
                                                new TreeNode(44)))),
                        new TreeNode(47,
                                new TreeNode(46),
                                new TreeNode(48,
                                        null,
                                        new TreeNode(49)))));
        System.out.println(tree.closestValue(root, 3));

    }
}
