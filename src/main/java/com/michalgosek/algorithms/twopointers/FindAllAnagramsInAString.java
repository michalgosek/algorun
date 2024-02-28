package com.michalgosek.algorithms.twopointers;

/*
Find All Anagrams in a String
Given a string original and a string check, find the starting index of all
substrings of original that is an anagram of check. The output must be sorted in ascending order.

Parameters
original: A string
check: A string

Result
A list of integers representing the starting indices of all anagrams of check.

Examples

Example 1
Input: original = "cbaebabacd", check = "abc"
Output: [0, 6]
Explanation: The substring from 0 to 2, "cba", is an anagram of "abc", and so is the substring from 6 to 8, "bac".

Example 2
Input: original = "abab", check = "ab"
Output: [0, 1, 2]
Explanation: All substrings with length 2 from "abab" is an anagram of "ab".

Constraints
1 <= len(original), len(check) <= 10^5
Each string consists of only lowercase characters in standard English alphabet.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsInAString {
    public static List<Integer> findAllAnagrams(String original, String check) {
        if (original.length() < check.length()) return new ArrayList<>();

        var total = new ArrayList<Integer>();
        var checkCharactersFrequencies = new int[26];
        var windowCharactersFrequencies = new int[26];
        var checkLength = check.length();
        for (var index = 0; index < checkLength; index++) {
            checkCharactersFrequencies[check.charAt(index) - 'a']++;
            windowCharactersFrequencies[original.charAt(index) - 'a']++;
        }

        if (Arrays.equals(checkCharactersFrequencies, windowCharactersFrequencies)) total.add(0);

        var windowSize = check.length();
        var originalLength = original.length();
        for (var index = windowSize; index < originalLength; ++index) {
            windowCharactersFrequencies[original.charAt(index - checkLength) - 'a']--;
            windowCharactersFrequencies[original.charAt(index) - 'a']++;
            if (Arrays.equals(checkCharactersFrequencies, windowCharactersFrequencies))
                total.add(index - checkLength + 1);
        }
        return total;
    }
}
