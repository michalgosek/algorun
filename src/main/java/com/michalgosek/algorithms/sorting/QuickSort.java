package com.michalgosek.algorithms.sorting;

import java.util.List;

public class QuickSort {
    public static void Sort(List<Integer> numbers) {
        sort(numbers, 0, numbers.size());
    }

    /**
     * Time complexity: O(nlog(n))<br>
     * Space complexity: O(n)<br><br>
     * The algorithm is not stable.
     */
    private static void sort(List<Integer> numbers, int start, int end) {
        if (end - start <= 1) return;

        var pivot = numbers.get(end - 1);
        var startPtr = start;
        var endPtr = end - 1;

        while (startPtr < endPtr) {
            while (numbers.get(startPtr) < pivot && startPtr < endPtr)
                startPtr++;

            while (numbers.get(endPtr) >= pivot && startPtr < endPtr)
                endPtr--;

            if (startPtr != endPtr)
                swap(numbers, startPtr, endPtr, numbers.get(startPtr));
        }

        // swap pivot in the correct position
        swap(numbers, startPtr, end - 1, numbers.get(startPtr));

        // left interval before pivot
        sort(numbers, start, startPtr);
        // right interval after pivot
        sort(numbers, startPtr + 1, end);
    }

    private static void swap(List<Integer> numbers, int startPtr, int endPtr, Integer temp) {
        numbers.set(startPtr, numbers.get(endPtr));
        numbers.set(endPtr, temp);
    }
}