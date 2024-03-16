package com.michalgosek.problems;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
438. Find All Anagrams in a String

Link: https://leetcode.com/problems/find-all-anagrams-in-a-string/description/

Given two strings s and p, return an array of all the start indices of p's anagrams in s.
You may return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
typically using all the original letters exactly once.

Example 1:

Input: s = "cbaebabacd", p = "abc"
Output: [0,6]

Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".
Example 2:

Input: s = "abab", p = "ab"
Output: [0,1,2]

Explanation:
The substring with start index = 0 is "ab", which is an anagram of "ab".
The substring with start index = 1 is "ba", which is an anagram of "ab".
The substring with start index = 2 is "ab", which is an anagram of "ab".

Constraints:
1 <= s.length, p.length <= 3 * 104
s and p consist of lowercase English letters.
 */
public class FindAllAnagramsInAString {
    /**
     * Time complexity: O(n)
     * Space complexity: O(c)
     */
    public List<Integer> Solution(String original, String check) {
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
