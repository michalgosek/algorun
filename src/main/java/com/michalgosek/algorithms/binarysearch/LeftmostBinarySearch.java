package com.michalgosek.algorithms.binarysearch;

import java.util.List;

public class LeftmostBinarySearch {
    public static int Search(List<Integer> numbers, int target) {
        var left = 0;
        var right = numbers.size();
        while (left < right) {
            var mid = left + (right - left) / 2;
            if (numbers.get(mid) < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
