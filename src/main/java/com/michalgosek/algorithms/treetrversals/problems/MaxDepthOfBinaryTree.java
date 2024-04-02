package com.michalgosek.algorithms.treetrversals.problems;

import com.michalgosek.algorithms.treetrversals.Node;

/*
Max depth of a binary tree:

Max depth of a binary tree is the longest root-to-leaf path. Given a binary tree, find its max depth.
Here, we define the length of the path to be the number of edges on that path, not the number of nodes.

Input:
    5
   / \
  4   6
 / \
3   8

Output: 2
 */
public class MaxDepthOfBinaryTree {
    public static int treeMaxDepthWithState(Node<Integer> root) {
        if (root == null) {
            return 0;
        }
        var leftSubtree = treeMaxDepthWithState(root.left);
        var rightSubtree = treeMaxDepthWithState(root.right);
        return Math.max(leftSubtree, rightSubtree) + 1;
    }
}
