package com.michalgosek.algorithms.sorting;

import java.util.List;

public class QuickSort {
    public static void Sort(List<Integer> numbers) {
        quickSort(numbers, 0, numbers.size() - 1);
    }

    /**
     * Time complexity: O(nlog(n))<br>
     * Space complexity: O(n)<br><br>
     * The algorithm is not stable.
     */
    private static void quickSort(List<Integer> numbers, int low, int hi) {
        if (low < hi) {
            var pIdx = partition(numbers, low, hi);
            quickSort(numbers, low, pIdx - 1);
            quickSort(numbers, pIdx + 1, hi);
        }
    }

    private static int partition(List<Integer> numbers, int low, int hi) {
        var pivot = numbers.get(hi);
        var pIdx = low - 1;
        for (var idx = low; idx < hi; idx++) {
            if (numbers.get(idx) <= pivot) {
                swap(numbers, idx, ++pIdx, numbers.get(idx));
            }
        }

        swap(numbers, pIdx + 1, hi, numbers.get(pIdx + 1));
        return pIdx + 1;
    }

    private static void swap(List<Integer> numbers, int pIdx, int hi, Integer tmp) {
        numbers.set(pIdx, numbers.get(hi));
        numbers.set(hi, tmp);
    }
}