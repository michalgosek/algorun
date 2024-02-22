package com.michalgosek.algorithms.binarysearch.problems;

import java.util.List;

/*
Find Minimum in Rotated Sorted Array

A sorted array of unique integers was rotated at an unknown pivot. For example, [10, 20, 30, 40, 50]
becomes [30, 40, 50, 10, 20]. Find the index of the minimum element in this array.

Input: [30, 40, 50, 10, 20]
Output: 3

Explanation: the smallest element is 10 and its index is 3.

Input: [3, 5, 7, 11, 13, 17, 19, 2]
Output: 7

Explanation: the smallest element is 2 and its index is 7.
 */
public class FindMinimumInRotatedSortedArray {
    public static int Solution(List<Integer> arr) {
        var target = arr.get(arr.size() - 1);
        var left = 0;
        var right = arr.size() - 1;
        var index = -1;
        while (left <= right) {
            var mid = left + (right - left) / 2;
            if (arr.get(mid) <= target) {
                index = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return index;
    }
}