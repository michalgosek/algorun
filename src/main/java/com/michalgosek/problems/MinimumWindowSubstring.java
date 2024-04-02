package com.michalgosek.problems;

import java.util.HashMap;

/*
76. Minimum Window Substring

Link: https://leetcode.com/problems/minimum-window-substring/description/

Given two strings, original and check, return the minimum substring of original such that each character in check,
including duplicates, are included in this substring. By "minimum", I mean the shortest substring. If two substrings
that satisfy the condition has the same length, the one that comes lexicographically first are smaller.

Parameters
original: The original string.
check: The string to check if a window contains it.
Result
The smallest substring of original that satisfy the condition.
Examples
Example 1
Input: original = "cdbaebaecd", check = "abc"
Output: baec

Explanation: baec is the shortest substring of original that contains all of a, b, and c.

Constraints
1 <= len(check), len(original) <= 10^5
original and check both contains only upper case and lower case characters in English. The characters are case sensitive.
 */

public class MinimumWindowSubstring {
    /**
     * Time complexity: O(n)
     * Space complexity: O(1)
     */
    public static String Solution(String original, String check) {
        var checkCharacters = new HashMap<Character, Integer>();
        for (var character : check.toCharArray()) {
            checkCharacters.merge(character, 1, Integer::sum);
        }

        var requiredCharactersCount = checkCharacters.size();
        var windowRequiredCharactersCount = 0;
        var windowCharacters = new HashMap<Character, Integer>();

        var left = 0;
        var startIndex = -1;
        var endIndex = -1;
        var minimumSubstringLength = original.length() + 1;
        for (var right = 0; right < original.length(); ++right) {
            var currentRightCharacter = original.charAt(right);

            if (checkCharacters.containsKey(currentRightCharacter)) {
                windowCharacters.put(currentRightCharacter, windowCharacters.getOrDefault(currentRightCharacter, 0) + 1);
                if (checkCharacters.get(currentRightCharacter).intValue() == windowCharacters.get(currentRightCharacter).intValue()) {
                    windowRequiredCharactersCount++;
                }
            }

            while (windowRequiredCharactersCount == requiredCharactersCount) {
                var currentMinimumSubstring = right - left + 1;
                if (currentMinimumSubstring < minimumSubstringLength) {
                    minimumSubstringLength = currentMinimumSubstring;
                    startIndex = left;
                    endIndex = right;
                }
                var leftCharacter = original.charAt(left);
                if (checkCharacters.containsKey(leftCharacter)) {
                    windowCharacters.put(leftCharacter, windowCharacters.get(leftCharacter) - 1);
                    if (windowCharacters.get(leftCharacter) < checkCharacters.get(leftCharacter)) {
                        windowRequiredCharactersCount--;
                    }
                }
                left++;
            }
        }
        return startIndex >= 0 ? original.substring(startIndex, endIndex + 1) : "";
    }
}
