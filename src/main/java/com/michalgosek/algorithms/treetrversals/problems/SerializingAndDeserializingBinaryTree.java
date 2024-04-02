package com.michalgosek.algorithms.treetrversals.problems;

import com.michalgosek.algorithms.treetrversals.Node;

import java.util.Arrays;
import java.util.Iterator;
import java.util.StringJoiner;

/*
Given a binary tree, write a serialize function that converts the tree into a string and a deserialize function
that converts a string to a binary tree. You may serialize the tree into any string representation you
want as long as it can be deseralized.
 */

public class SerializingAndDeserializingBinaryTree {
    private static void serializeDfs(Node<Integer> root, StringJoiner result) {
        if (root == null) {
            result.add("x");
            return;
        }
        result.add(Integer.toString(root.value));
        serializeDfs(root.left, result);
        serializeDfs(root.right, result);
    }

    private static Node<Integer> deserializeDfs(Iterator<String> nodes) {
        var value = nodes.next();
        if (value.equals("x")) {
            return null;
        }
        var curr = new Node<>(Integer.parseInt(value));
        curr.left = deserializeDfs(nodes);
        curr.right = deserializeDfs(nodes);
        return curr;
    }

    /**
     * Time complexity: O(n)
     * Space complexity: O(h) where "h" is the height of the tree representing the stack memory space,
     * which in the worst case can be O(n)
     */

    public String serialize(Node<Integer> root) {
        var result = new StringJoiner(" ");
        serializeDfs(root, result);
        return result.toString();
    }

    /**
     * Time complexity: O(n)
     * Space complexity: O(n), because: O(h) + O(n)
     * where O(h) is the stack memory space, where h is the height of the tree
     * where O(n) is the number of the new nodes to create.
     * O(n) is the dominant term
     */
    public Node<Integer> deserialize(String root) {
        return deserializeDfs(Arrays.stream(root.split(" ")).iterator());
    }
}
