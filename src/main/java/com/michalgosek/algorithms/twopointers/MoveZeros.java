package com.michalgosek.algorithms.twopointers;

import java.util.List;

/*
Move Zeros - same direction two pointers.
Given an array of integers, move all the 0s to the back of the array while maintaining the relative order of the non-zero elements.
Do this in-place using constant auxiliary space.

Input:
[1, 0, 2, 0, 0, 7]

Output:
[1, 2, 7, 0, 0, 0]
 */
public class MoveZeros {
    public static void Solution(List<Integer> nums) {
        var N = nums.size();
        var first = 0;
        for (var second = 0; second < N; ++second) {
            if (nums.get(second) != 0) {
                var temp = nums.get(first);
                nums.set(first++, nums.get(second));
                nums.set(second, temp);
            }
        }
    }
}
