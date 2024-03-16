package com.michalgosek.algorithms.twopointers;

import com.michalgosek.datastructures.linkedlist.Node;

/*
Given a linked list with potentially a loop, determine whether the linked list from the first node
contains a cycle in it. For bonus points, do this with constant space.

Parameters
nodes: The first node of a linked list with potentially a loop.

Result
Whether there is a loop contained in the linked list.

Examples

Example 1
Input:
0-1-2-3-0
Output: true

Example 2
Input:
0-1-2-3
Output: false

 */
public class LinkedListCycle {
    public static boolean Solution(Node<Integer> nodes) {
        if (nodes == null) return false;

        var slow = nodes;
        var fast = nodes.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }
}
