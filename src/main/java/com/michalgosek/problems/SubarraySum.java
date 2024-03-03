package com.michalgosek.problems;

import java.util.HashMap;
import java.util.List;

/*
Practice Problem: Subarray Sum
Given an array of integers and an integer target, find a subarray that sums to target
and return the start and end indices of the subarray.

Input: arr: 1 -20 -3 30 5 4 target: 7
Output: 1 4

Explanation: -20 - 3 + 30 = 7. The indices for subarray [-20,-3,30] is 1 and 4 (right exclusive).
 */
public class SubarraySum {
    public static List<Integer> subarraySum(List<Integer> arr, int target) {
        var prefixSum = new HashMap<Integer, Integer>();
        prefixSum.put(0, 0);
        var N = arr.size();
        var currentSum = 0;
        for (var index = 0; index < N; ++index) {
            currentSum += arr.get(index);
            var complement = currentSum - target;
            if (prefixSum.containsKey(complement)) {
                return List.of(prefixSum.get(complement), index + 1);
            }
            prefixSum.put(currentSum, index + 1);
        }

        return List.of();
    }
}
