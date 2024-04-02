package com.michalgosek.algorithms.treetrversals;

import java.util.Stack;

public class PostOrder<T> {
    public void postOrderTraversalRecursive(Node<T> root) {
        if (root != null) {
            postOrderTraversalRecursive(root.left);
            postOrderTraversalRecursive(root.right);
            System.out.println(root.value);
        }
    }

    public void postOrderTraversalIterative(Node<T> root) {
        Stack<Node<T>> stack = new Stack<>();
        Stack<T> out = new Stack<>();
        if (root != null) {
            stack.push(root);
        }

        while (!stack.isEmpty()) {
            Node<T> curr = stack.pop();
            out.push(curr.value);
            if (curr.left != null) {
                stack.push(curr.left);
            }
            if (curr.right != null) {
                stack.push(curr.right);
            }
        }

        while (!out.isEmpty()) {
            System.out.println(out.pop());
        }
    }
}
