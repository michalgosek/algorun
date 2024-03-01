package com.michalgosek.algorithms.twopointers;

import java.util.List;

/*
Flexible Size Sliding Window - Longest
Recall finding the largest size k subarray sum of an integer array in Largest Subarray Sum.
What if we don't need the largest sum among all subarrays of fixed size k, but instead,
we want to find the length of the longest subarray with sum smaller than or equal to a target?

Given input nums = [1, 6, 3, 1, 2, 4, 5] and target = 10,
then the longest subarray that does not exceed 10 is [3, 1, 2, 4],
so the output is 4 (length of [3, 1, 2, 4]).

 */
public class FlexibleSizeSlidingWindowLongest {
    public static int subarraySumLongest(List<Integer> nums, int target) {
        int longestSubarray = 0;
        var left = 0;
        var windowSum = 0;
        var N = nums.size();
        for (var right = 0; right < N; ++right) {
            windowSum += nums.get(right);
            if (windowSum > target) {
                windowSum -= nums.get(left++);
            }
            var currentWindowSize = (right - left) + 1;
            longestSubarray = Math.max(longestSubarray, currentWindowSize);
        }
        return longestSubarray;
    }
}
