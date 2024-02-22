package com.michalgosek.algorithms.binarysearch.problems;

import java.util.List;

/*
First Element Not Smaller Than Target

Given an array of integers sorted in increasing order and a target, find the index of the first element
in the array that is larger than or equal to the target. Assume that it is guaranteed to find a satisfying number.

Input:
arr = [1, 3, 3, 5, 8, 8, 10]
target = 2
Output: 1

Explanation: the first element larger than 2 is 3 which has index 1.

Input:
arr = [2, 3, 5, 7, 11, 13, 17, 19]
target = 6
Output: 3

Explanation: the first element larger than 6 is 7 which has index 3.
*/
public class FirstNotSmaller {
    public static int Solution(List<Integer> arr, int target) {
        var left = 0;
        var right = arr.size() - 1;
        var index = -1;
        while (left <= right) {
            var mid = left + (right - left) / 2;
            if (arr.get(mid) >= target) {
                index = mid;
                right = mid - 1;
            } else left = mid + 1;
        }
        return index;
    }
}