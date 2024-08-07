package com.michalgosek.problems.trees;

import java.util.*;

/*
94. Binary Tree Inorder Traversal

Link: https://leetcode.com/problems/binary-tree-inorder-traversal/description/

Given the root of a binary tree, return the inorder traversal of its nodes' values.

Example 1:
Input: root = [1,null,2,3]
Output: [1,3,2]
Example 2:

Input: root = []
Output: []
Example 3:

Input: root = [1]
Output: [1]

Constraints:
The number of nodes in the tree is in the range [0, 100].
-100 <= Node.val <= 100


Follow up: Recursive solution is trivial, could you do it iteratively?
 */
class InOrderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) return null;
        var numbers = new ArrayList<Integer>();
        var stack = new Stack<TreeNode>();
        var current = root;
        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            var pop = stack.pop();
            numbers.add(pop.val);
            current = pop.right;
        }
        return numbers;
    }
}