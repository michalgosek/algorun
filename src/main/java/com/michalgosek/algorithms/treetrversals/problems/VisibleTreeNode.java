package com.michalgosek.algorithms.treetrversals.problems;

import com.michalgosek.algorithms.treetrversals.Node;

/*
Visible Tree Node | Number of Visible Nodes
In a binary tree, a node is labeled as "visible" if, on the path from the root to that node,
there isn't any node with a value higher than this node's value.

The root is always "visible" since there are no other nodes between the root and itself.
Given a binary tree, count the number of "visible" nodes.

Input:
    5
   / \
  4   6
 / \
3   8

Output: 3

For example: Node 4 is not visible since 5>4, similarly Node 3 is not visible since both 5>3 and 4>3.
Node 8 is visible since all 5<=8, 4<=8, and 8<=8.
 */
public class VisibleTreeNode {
    public static int visibleTreeNode(Node<Integer> root) {
        return 1 + dfs(root.left, Integer.MIN_VALUE) + dfs(root.right, Integer.MIN_VALUE);
    }

    static int dfs(Node<Integer> root, int currentMax) {
        if (root == null) {
            return 0;
        }

        var totalVisible = 0;
        if (root.value >= currentMax) {
            currentMax = root.value;
            totalVisible++;
        }

        totalVisible += dfs(root.left, currentMax);
        totalVisible += dfs(root.right, currentMax);
        return totalVisible;
    }
}
