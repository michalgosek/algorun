package com.michalgosek.algorithms.sorting;

import java.util.List;

public class InsertionSort {
    /**
     * Time complexity: O(n^2)<br>
     * Space complexity: O(1)<br><br>
     * The algorithm is stable and in place.
     */
    public static List<Integer> Sort(List<Integer> numbers) {
        for (var i = 0; i < numbers.size(); ++i) {
            var current = i;
            while (current > 0 && numbers.get(current) < numbers.get(current - 1)) {
                swap(numbers, current, current - 1);
                current--;
            }
        }
        return numbers;
    }

    private static void swap(List<Integer> numbers, int current, int previous) {
        var temp = numbers.get(current);
        numbers.set(current, numbers.get(previous));
        numbers.set(previous, temp);
    }
}