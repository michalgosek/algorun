package com.michalgosek.algorithms.binarysearch.problems;

import java.util.List;

/*
Find the First True in a Sorted Boolean Array

An array of boolean values is divided into two sections; the left section consists of all false and the right section
consists of all true. Find the First True in a Sorted Boolean Array of the right section, i.e. the index of
the first true element. If there is no true element, return -1.

Input: arr = [false, false, true, true, true]
              [0,0,1,1,1]

Output: 2
Explanation: first true's index is 2.
 */
public class FindBoundary {
    public static int Solution(List<Boolean> arr) {
        var left = 0;
        var right = arr.size() - 1;
        var index = -1;
        while (left <= right) {
            var mid = left + (right - left) / 2;
            if (arr.get(mid)) {
                index = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return index;
    }
}