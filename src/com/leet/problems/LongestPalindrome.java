package com.leet.problems;

import java.util.HashSet;
import java.util.Set;

/***
 * Length of the longest palindromic substring
 * leetcode => https://leetcode.com/problems/longest-palindrome/
 *
 * Example 1:
 *
 * Input: s = "abccccdd"
 * Output: 7
 * Explanation:
 * One longest palindrome that can be built is "dccaccd", whose length is 7.
 * Example 2:
 *
 * Input: s = "a"
 * Output: 1
 * Example 3:
 *
 * Input: s = "bb"
 * Output: 2
 *
 * Hint : Add all chars to Set that doesn't have duplicates.
 */

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        if (s == null || s.length() < 1) return 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i)))
                set.remove(s.charAt(i));
            else
                set.add(s.charAt(i));
        }
        if (set.size() <= 1)
            return s.length();

        return s.length() - set.size() + 1;
    }

    public static void main(String [] args){
        System.out.println(new LongestPalindrome().longestPalindrome("abccccdd"));
    }

}
