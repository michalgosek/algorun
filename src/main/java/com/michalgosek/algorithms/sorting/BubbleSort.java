package com.michalgosek.algorithms.sorting;

import java.util.List;

public class BubbleSort {
    public static List<Integer> Sort(List<Integer> numbers) {
        for (var i = numbers.size() - 1; i >= 0; i--) {
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