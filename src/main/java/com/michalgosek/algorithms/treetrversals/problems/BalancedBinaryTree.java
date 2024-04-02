package com.michalgosek.algorithms.treetrversals.problems;

import com.michalgosek.algorithms.treetrversals.Node;

public class BalancedBinaryTree {

    private static int dfs(Node<Integer> tree) {
        if (tree == null) {
            return 0;
        }
        var leftSubtree = dfs(tree.left);
        var rightSubtree = dfs(tree.right);
        if (leftSubtree == -1 || rightSubtree == -1) {
            return -1;
        }
        if (Math.abs(leftSubtree - rightSubtree) > 1) {
            return -1;
        }
        return Math.max(leftSubtree, rightSubtree) + 1;
    }

    public static boolean isBalanced(Node<Integer> tree) {
        return dfs(tree) != -1;
    }
}
