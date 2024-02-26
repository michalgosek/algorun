package com.michalgosek.algorithms.twopointers;

import java.util.List;

/*
Two Sum Sorted - opposite direction two pointers

Given an array of integers sorted in ascending order, find two numbers that add up to a given target.
Return the indices of the two numbers in ascending order.

You can assume elements in the array are unique and there is only one solution.
Do this in O(n) time and with constant auxiliary space.

Input:
arr: a sorted integer array
target: the target sum we want to reach
Sample Input: [2 3 4 5 8 11 18], 8

Sample Output: 1 3
 */
public class TwoSumSorted {
    public static List<Integer> Solution(List<Integer> arr, int target) {
        var firstPointer = 0;
        var secondPointer = arr.size() - 1;

        while (firstPointer < secondPointer) {
            var sum = arr.get(firstPointer) + arr.get(secondPointer);
            if (sum == target) {
                return List.of(firstPointer, secondPointer);
            }
            if (sum > target) secondPointer--;
            else firstPointer++;
        }
        return List.of();
    }
}
