package com.michalgosek.algorithms.twopointers.slidingwindow;

import java.util.List;

public class FlexibleSizeSlidingWindowLongest {
    public static int subarraySumLongest(List<Integer> nums, int target) {
        var left = 0;
        var N = nums.size();
        var subarrayLongestSum = 0;
        var longestSubarrayLength = Integer.MIN_VALUE;

        for (var right = 0; right < N; ++right) {
            subarrayLongestSum += nums.get(right);
            while (subarrayLongestSum > target) {
                subarrayLongestSum -= nums.get(left);
                ++left;
            }
            longestSubarrayLength = Math.max(longestSubarrayLength, right - left + 1);
        }
        return longestSubarrayLength;
    }
}
