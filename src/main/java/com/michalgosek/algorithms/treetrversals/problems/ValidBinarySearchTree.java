package com.michalgosek.algorithms.treetrversals.problems;

import com.michalgosek.algorithms.treetrversals.Node;

public class ValidBinarySearchTree {
    public static boolean validBstDfs(Node<Integer> root, int upper, int lower) {
        if (root == null) {
            return true;
        }
        if (!(root.value >= lower && root.value < upper)) {
            return false;
        }
        if (!validBstDfs(root.left, root.value, lower)) return false;
        return validBstDfs(root.right, upper, root.value);
    }

    public static boolean validBst(Node<Integer> root) {
        return validBstDfs(root.left, Integer.MAX_VALUE, Integer.MIN_VALUE);
    }
}
