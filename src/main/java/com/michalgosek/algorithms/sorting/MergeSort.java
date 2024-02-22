package com.michalgosek.algorithms.sorting;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
    public static List<Integer> Sort(List<Integer> numbers) {
        return numbersInterval(numbers, 0, numbers.size());
    }

    private static List<Integer> numbersInterval(List<Integer> numbers, int start, int end) {
        if (end - start <= 1) {
            return numbers.subList(start, end);
        }

        var midPoint = (start + end) / 2;
        var leftInterval = numbersInterval(numbers, start, midPoint);
        var rightInterval = numbersInterval(numbers, midPoint, end);

        var result = new ArrayList<Integer>();
        var left = 0;
        var right = 0;

        while (left < leftInterval.size() || right < rightInterval.size()) {
            if (left == leftInterval.size()) {
                result.add(rightInterval.get(right));
                right++;
            } else if (right == rightInterval.size()) {
                result.add(leftInterval.get(left));
                left++;
            } else if (leftInterval.get(left) <= rightInterval.get(right)) {
                result.add(leftInterval.get(left));
                left++;
            } else {
                result.add(rightInterval.get(right));
                right++;

            }
        }
        return result;
    }
}