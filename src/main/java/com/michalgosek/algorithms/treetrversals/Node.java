package com.michalgosek.algorithms.treetrversals;

public class Node<T> {
    public T value;
    public Node<T> left;
    public Node<T> right;

    public Node(T value) {
        this.value = value;
    }

    public Node(T value, Node<T> left, Node<T> right) {
        this.value = value;
        this.right = right;
        this.left = left;
    }
}


