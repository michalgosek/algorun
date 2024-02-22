package com.michalgosek.algorithms.binarysearch;

import java.util.List;

public class BinarySearch {
    public static int Search(List<Integer> numbers, int target) {
        var left = 0;
        var right = numbers.size() - 1;
        while (left <= right) {
            var mid = left + (right - left) / 2;
            if (numbers.get(mid) == target) return mid;
            else if (numbers.get(mid) > target) right = mid - 1;
            else left = mid + 1;
        }
        return -1;
    }
}