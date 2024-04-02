package com.michalgosek.problems;

/*
Find All Anagrams in a String

Link: https://leetcode.com/problems/find-all-anagrams-in-a-string/description/

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

    /**
     * Time complexity: O(n)
     * Space complexity: O(n)
     */
    public static List<Integer> Solution(String original, String check) {
        var startingIndices = new ArrayList<Integer>();
        var checkLength = check.length();
        var originalLength = original.length();

        if (checkLength > originalLength) {
            return startingIndices;
        }

        var windowCharacters = new int[26];
        var checkCharacters = new int[26];
        for (var index = 0; index < checkLength; ++index) {
            windowCharacters[original.charAt(index) - 'a']++;
            checkCharacters[check.charAt(index) - 'a']++;
        }

        if (Arrays.equals(windowCharacters, checkCharacters)) {
            startingIndices.add(0);
        }

        for (var index = checkLength; index < originalLength; ++index) {
            var left = original.charAt(index - checkLength) - 'a';
            var right = original.charAt(index) - 'a';
            windowCharacters[left]--;
            windowCharacters[right]++;
            if (Arrays.equals(windowCharacters, checkCharacters)) {
                startingIndices.add(index - checkLength + 1);
            }
        }
        return startingIndices;
    }
}
