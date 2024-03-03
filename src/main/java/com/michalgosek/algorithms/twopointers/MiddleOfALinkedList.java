package com.michalgosek.algorithms.twopointers;

import com.michalgosek.datastructures.linkedlist.Node;

/*
Find the middle node of a linked list - same direction two pointers.

Input: 0 1 2 3 4

Output: 2

If the number of nodes is even, then return the second middle node.

Input: 0 1 2 3 4 5

Output: 3
 */
public class MiddleOfALinkedList {
    public static int Solution(Node<Integer> head) {
        var fast = head;
        var slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.val;
    }
}
