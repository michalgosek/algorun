package com.michalgosek.algorithms.twopointers;

import java.util.HashSet;

/*
Longest Substring without Repeating Characters
Find the length of the longest substring of a given string without repeating characters.

Input: abccabcabcc
Output: 3

Explanation: longest substrings are abc, cab, both of length 3

Input: aaaabaaa
Output: 2

Explanation: ab is the longest substring, length 2
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public static int longestSubstringWithoutRepeatingCharacters(String s) {
        var N = s.length();
        var left = 0;
        var windowCharacterSet = new HashSet<Character>();
        var longestSubstringSize = 0;
        for (var right = 0; right < N; ++right) {
            var currentCharacter = s.charAt(right);
            while (windowCharacterSet.contains(currentCharacter)) {
                windowCharacterSet.remove(s.charAt(left++));
            }
            windowCharacterSet.add(currentCharacter);
            longestSubstringSize = Math.max(longestSubstringSize, (right - left) + 1);
        }
        return longestSubstringSize;
    }
}
