package com.michalgosek.algorithms.twopointers.slidingwindow;

import java.util.List;

/*
Given an array (list) nums consisted of only non-negative integers, find the largest sum among all
subarrays of length k in nums.

For example, if the input is nums = [1, 2, 3, 7, 4, 1], k = 3, then the output would be 14 as the
largest length 3 subarray sum is given by [3, 7, 4] which sums to 14.
 */
public class FixedSizeSlidingWindow {
    public static int subarraySumFixed(List<Integer> nums, int k) {
        if (nums.size() < k) {
            throw new RuntimeException("The nums list size is less then specified k");
        }

        var currentWindow = 0;
        for (var i = 0; i < k; i++)
            currentWindow += nums.get(i);

        var maxSubarraySum = currentWindow;
        var N = nums.size();
        for (var right = k; right < N; right++) {
            var left = right - k;
            currentWindow += nums.get(right) - nums.get(left);
            maxSubarraySum = Math.max(currentWindow, maxSubarraySum);
        }
        return maxSubarraySum;
    }
}
