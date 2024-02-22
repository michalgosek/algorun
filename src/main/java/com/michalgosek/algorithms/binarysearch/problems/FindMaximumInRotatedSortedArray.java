package com.michalgosek.algorithms.binarysearch.problems;

import java.util.List;

/*
Find Maximum in Rotated Sorted Array

A sorted array of unique integers was rotated at an unknown pivot. For example, [10, 20, 30, 40, 50]
becomes [30, 40, 50, 10, 20]. Find the index of the maximum element in this array.

Input: [30, 40, 50, 10, 20]
Output: 2

Explanation: the maximum element is 50 and its index is 2.

Input: [3, 5, 7, 11, 13, 17, 19, 2]
Output: 6

Explanation: the smallest element is 19 and its index is 6.
 */
public class FindMaximumInRotatedSortedArray {
    public static int Solution(List<Integer> arr) {
        var index = 0;
        var left = 0;
        var target = arr.get(arr.size() - 1);
        var right = arr.size() - 1;
        while (left <= right) {
            var mid = left + (right - left) / 2;
            if (arr.get(mid) <= target) {
                index = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return index == 0 ? arr.size() - 1 : index - 1;
    }
}
