package com.michalgosek.algorithms.treetrversals;

import java.util.Stack;

public class InOrder<T> {
    public void TraverseRecursion(Node<T> root) {
        if (root != null) {
            TraverseRecursion(root.left);
            System.out.println(root.value);
            TraverseRecursion(root.right);
        }
    }

    public void TraverseIterative(Node<T> root) {
        var stack = new Stack<Node<T>>();
        var current = root;
        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            System.out.println(current.value);
            current = current.right;
        }
    }
}
