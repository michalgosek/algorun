package com.michalgosek.algorithms.treetrversals;

import java.util.Stack;

public class PreOrder<T> {
    public void preOrderTraversalRecursive(Node<T> root) {
        if (root != null) {
            System.out.println(root.value);
            preOrderTraversalRecursive(root.left);
            preOrderTraversalIterative(root.right);
        }
    }

    public void preOrderTraversalIterative(Node<T> root) {
        if (root == null) return;

        var stack = new Stack<Node<T>>();
        stack.push(root);

        while (!stack.isEmpty()) {
            var current = stack.pop();
            System.out.println(current.value);

            if (current.right != null) {
                stack.push(current.right);
            }
            if (current.left != null) {
                stack.push(current.left);
            }
        }
    }
}
