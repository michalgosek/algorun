package com.michalgosek.algorithms.sorting;

import java.util.List;

public class InsertionSort {
    public static List<Integer> Sort(List<Integer> numbers) {
        for (var i = 0; i < numbers.size(); i++) {
            var current = i;
            while (current > 0 && numbers.get(current) < numbers.get(current - 1)) {
                var temp = numbers.get(current);
                numbers.set(current, numbers.get(current - 1));
                numbers.set(current - 1, temp);
                current--;
            }
        }
        return numbers;
    }
}