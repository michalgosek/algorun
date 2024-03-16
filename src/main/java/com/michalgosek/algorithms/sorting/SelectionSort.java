package com.michalgosek.algorithms.sorting;

import java.util.List;

public class SelectionSort {
    /**
     * Time complexity: O(n^2)<br>
     * Space complexity: O(1)<br><br>
     * The algorithm is in place and inherently unstable due to the way it <b>selects</b> and <b>swaps</b> elements.<br><br>
     * Original array:
     * <code>[(3, 'A'), (2, 'A'), (3, 'B'), (2, 'B'), (1, 'A')]</code><br><br>
     * After sorting:
     * <code>[(1, 'A'), (2, 'A'), (2, 'B'), (3, 'B'), (3, 'A')]</code><br><br>
     * Notice that <b>(3, 'A')</b> is after <b>(3, 'B')</b>.
     */
    public static List<Integer> Sort(List<Integer> numbers) {
        var N = numbers.size();
        for (var i = 0; i < N; i++) {
            var currentMinIndex = i;
            for (var j = currentMinIndex; j < N; j++) {
                if (numbers.get(j) < numbers.get(currentMinIndex)) {
                    currentMinIndex = j;
                }
            }
            swap(numbers, i, currentMinIndex);
        }

        return numbers;
    }

    private static void swap(List<Integer> numbers, int i, int currentMinIndex) {
        var current = numbers.get(i);
        numbers.set(i, numbers.get(currentMinIndex));
        numbers.set(currentMinIndex, current);
    }
}
