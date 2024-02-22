package com.michalgosek.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Link: https://leetcode.com/problems/find-target-indices-after-sorting-array/description/

You are given a 0-indexed integer array nums and a target element target.
A target index is an index i such that nums[i] == target.
Return a list of the target indices of nums after sorting nums in non-decreasing order.
If there are no target indices, return an empty list. The returned list must be sorted in increasing order.

Example 1:
Input: nums = [1,2,5,2,3], target = 2
Output: [1,2]
Explanation: After sorting, nums is [1,2,2,3,5].
The indices where nums[i] == 2 are 1 and 2.

Example 2:
Input: nums = [1,2,5,2,3], target = 3
Output: [3]
Explanation: After sorting, nums is [1,2,2,3,5].
The index where nums[i] == 3 is 3.

Example 3:
Input: nums = [1,2,5,2,3], target = 5
Output: [4]
Explanation: After sorting, nums is [1,2,2,3,5].
The index where nums[i] == 5 is 4.


Constraints:
1 <= nums.length <= 100
1 <= nums[i], target <= 100
 */
public class FindTargetIndicesAfterSortingArray {
    private static int findFirstOccurrence(int[] nums, int target) {
        var left = 0;
        var right = nums.length - 1;
        var index = -1;
        while (left <= right) {
            var mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                index = mid;
                right = mid - 1;
            } else if (target > nums[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return index;
    }

    /**
     * Time complexity: O(nlogn)
     * Space complexity: O(n)
     */
    public static List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        var idx = findFirstOccurrence(nums, target);
        if (idx == -1) {
            return new ArrayList<>();
        }

        var out = new ArrayList<Integer>();
        for (var i = idx; i < nums.length; i++) {
            if (nums[i] != target) break;
            out.add(i);
        }
        return out;
    }
}