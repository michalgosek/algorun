package com.michalgosek.algorithms.sorting;

import java.util.List;

public class BubbleSort {
    /**
     * Time complexity: O(n^2)<br>
     * Space complexity: O(1)<br><br>
     * The algorithm is stable and in place.<br>
     * For sorted list ex. <code>[1, 2, 3, 4]</code> time complexity: O(n).
     */
    public static List<Integer> Sort(List<Integer> numbers) {
        var N = numbers.size();
        for (var i = N - 1; i >= 0; i--) {
            var swapped = false;
            for (var j = 0; j < i; j++) {
                if (numbers.get(j) > numbers.get(j + 1)) {
                    var temp = numbers.get(j);
                    numbers.set(j, numbers.get(j + 1));
                    numbers.set(j + 1, temp);
                    swapped = true;
                }
            }
            if (!swapped) {
                return numbers;
            }
        }
        return numbers;
    }
}