package com.michalgosek.problems;

import java.util.HashSet;

/*
Link: https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

3. Longest Substring Without Repeating Characters
Given a string s, find the length of the longest  substring without repeating characters.

Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

Constraints:
0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.
 */
public class LengthOfLongestSubstring {
    public static int Solution(String s) {
        if (s.isEmpty()) return 0;

        var maxSubstringLength = 0;
        var N = s.length();
        for (var firstPointer = 0; firstPointer < N; firstPointer++) {
            var letters = new HashSet<Character>();
            letters.add(s.charAt(firstPointer));

            var secondPointer = firstPointer + 1;
            if (secondPointer > N) break;

            while (secondPointer < N && !letters.contains(s.charAt(secondPointer))) {
                letters.add(s.charAt(secondPointer));
                secondPointer++;
            }
            maxSubstringLength = Math.max(maxSubstringLength, secondPointer - firstPointer);
        }
        return maxSubstringLength;
    }
}
