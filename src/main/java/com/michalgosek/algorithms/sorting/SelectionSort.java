package com.michalgosek.algorithms.sorting;

import java.util.List;

public class SelectionSort {
    public static List<Integer> Sort(List<Integer> numbers) {
        for (var i = 0; i < numbers.size(); i++) {
            var currentMinIndex = i;
            for (var j = currentMinIndex; j < numbers.size(); j++) {
                if (numbers.get(j) < numbers.get(currentMinIndex)) {
                    currentMinIndex = j;
                }
            }
            var current = numbers.get(i);
            numbers.set(i, numbers.get(currentMinIndex));
            numbers.set(currentMinIndex, current);
        }

        return numbers;
    }
}