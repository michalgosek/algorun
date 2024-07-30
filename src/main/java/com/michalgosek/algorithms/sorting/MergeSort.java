package com.michalgosek.algorithms.sorting;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
    /**
     * Time complexity: O(nlog(n))<br>
     * Space complexity: O(n)<br><br>
     * The algorithm is stable.
     */
    public static void Sort(List<Integer> numbers) {
        sort(numbers, 0, numbers.size() - 1);
    }

    private static void merge(List<Integer> numbers, int left, int mid, int right) {
        var leftArraySize = mid - left + 1;
        var leftArray = new ArrayList<Integer>();
        for (var i = 0; i < leftArraySize; i++) {
            leftArray.add(numbers.get(left + i));
        }

        var rightArraySize = right - mid;
        var rightArray = new ArrayList<Integer>();
        for (var i = 0; i < rightArraySize; i++) {
            rightArray.add(numbers.get(mid + 1 + i));
        }

        var leftIdx = 0;
        var rightIdx = 0;
        int idx = left;
        while (leftIdx < leftArraySize && rightIdx < rightArraySize) {
            if (leftArray.get(leftIdx) <= rightArray.get(rightIdx)) {
                numbers.set(idx++, leftArray.get(leftIdx++));
            } else {
                numbers.set(idx++, rightArray.get(rightIdx++));
            }
        }

        while (leftIdx < leftArraySize) {
            numbers.set(idx++, leftArray.get(leftIdx++));
        }

        while (rightIdx < rightArraySize) {
            numbers.set(idx++, rightArray.get(rightIdx++));
        }
    }

    private static void sort(List<Integer> numbers, int left, int right) {
        if (left < right) {
            var mid = (left + right) / 2;
            sort(numbers, left, mid);
            sort(numbers, mid + 1, right);
            merge(numbers, left, mid, right);
        }
    }
}