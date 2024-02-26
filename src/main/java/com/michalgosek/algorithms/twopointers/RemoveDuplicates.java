package com.michalgosek.algorithms.twopointers;

import java.util.List;

/*
Remove Duplicates - same direction two pointers

Given a sorted list of numbers, remove duplicates and return the new length. You must do this in-place
and without using extra memory.

Input: [0, 0, 1, 1, 1, 2, 2].

Output: 3.

Your function should modify the list in place so the first 3 elements becomes 0, 1, 2.
Return 3 because the new length is 3.
 */

public class RemoveDuplicates {
    public static int Solution(List<Integer> arr) {
        var N = arr.size();
        var firstPointer = 0;
        for (var secondPointer = 0; secondPointer < N; ++secondPointer) {
            if (!arr.get(secondPointer).equals(arr.get(firstPointer))) {
                arr.set(++firstPointer, arr.get(secondPointer));
            }
        }
        return firstPointer + 1;
    }
}
