package com.michalgosek.algorithms.twopointers;

import java.util.HashMap;
import java.util.List;

/*
Find the total number of subarrays that sums up to target.

Input: [1,4,1,4], target = 5
Output = 3

Explanation:
[1,4],[4,1],[1,4] = 3 pairs in total

 */
public class SubarraySumTotal {
    /**
     * Time complexity: O(n)
     * Space complexity: O(n)
     */
    public static int Solution(List<Integer> arr, int target) {
        var prefixSums = new HashMap<Integer, Integer>();
        prefixSums.put(0, 1); // Base case for empty subarray
        var currentSum = 0;
        var totalCount = 0;
        for (var number : arr) {
            currentSum += number;
            var complement = currentSum - target;
            // Check if there's a subarray that when removed from currentSum equals target
            totalCount += prefixSums.getOrDefault(complement, 0);
            // Update the map with the current sum's frequency
            prefixSums.put(currentSum, prefixSums.getOrDefault(currentSum, 0) + 1);
        }
        return totalCount;
    }
}
