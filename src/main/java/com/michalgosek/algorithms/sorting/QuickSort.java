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
    private static void quickSort(List<Integer> numbers, int lo, int hi) {
        if (lo < hi) {
            var pi = partition(numbers, lo, hi);
            quickSort(numbers, lo, pi - 1);
            quickSort(numbers, pi + 1, hi);
        }
    }

    private static int partition(List<Integer> numbers, int low, int hi) {
        var pivot = numbers.get(hi);
        var pIdx = low - 1;
        for (var idx = low; idx < hi; idx++) {
            if (numbers.get(idx) <= pivot) {
                pIdx++;
                var tmp = numbers.get(idx);
                numbers.set(idx, numbers.get(pIdx));
                numbers.set(pIdx, tmp);
            }
        }
        var tmp = numbers.get(pIdx + 1);
        numbers.set(pIdx + 1, numbers.get(hi));
        numbers.set(hi, tmp);
        return pIdx + 1;
    }
}