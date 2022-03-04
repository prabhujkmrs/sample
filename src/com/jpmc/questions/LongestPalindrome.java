package com.jpmc.questions;

import java.util.HashSet;
import java.util.Set;

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
