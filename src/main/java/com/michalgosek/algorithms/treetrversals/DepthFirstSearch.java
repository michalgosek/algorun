package com.michalgosek.algorithms.treetrversals;

public class DepthFirstSearch<T> {
    public Node<T> Search(Node<T> root, T traget) {
        if (root == null) {
            return null;
        }
        if (root.value == traget) {
            return root;
        }
        var left = Search(root.left, traget);
        if (left != null) {
            return left;
        }
        return Search(root.right, traget);
    }
}
