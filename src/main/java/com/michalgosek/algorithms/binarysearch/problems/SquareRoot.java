package com.michalgosek.algorithms.binarysearch.problems;

public class SquareRoot {
    public static int squareRoot(int n) {
        if (n == 0) return 0;

        var left = 1;
        var right = n;
        var index = -1;
        while (left <= right) {
            var mid = left + (right - left) / 2;
            if (mid == n / mid) {
                return mid;
            } else if (mid > n / mid) {
                index = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return index - 1;
    }
}