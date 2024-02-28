package com.michalgosek.algorithms.twopointers;

/*
Valid Palindrome - opposite direction two pointers
Determine whether a string is a palindrome, ignoring non-alphanumeric characters and case. Examples:

Input: Do geese see God? Output: True
Input: Was it a car or a cat I saw? Output: True
Input: A brown fox jumping over Output: False
 */

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        var left = 0;
        var right = s.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
