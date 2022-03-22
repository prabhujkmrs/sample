package com.leet.problems;

import java.util.*;

/**
 * # String with maximum number of unique characters
 * # Difficulty Level : Medium
 * # Last Updated : 07 Mar, 2022
 * # Given a list of strings, find the largest string among all.
 * # The largest string is the string with the largest number of unique characters.
 *
 *
 * # Example:
 * # Input : "AN KOW", "LO JO", "ZEW DO RO"
 * # Output : "ZEW DO RO"
 * # Explanation :
 * # "ZEW DO RO" has maximum distinct letters.
 *
 * # Input : "ROMEO", "EMINEM", "RADO"
 * # Output : "ROMEO"
 * # Explanation : In case of tie, we can print
 * # any of the strings.
 */

public class UniqueCharacters {

    private String largestString(List<String> input) {
        Map<Integer,String> strMap = new HashMap<>();
        for(String v: input){
            strMap.put(strSize(v),v);
        }
        // get max of keys
        int maxKey = strMap.entrySet().stream().max((e1, e2) -> e1.getKey() > e2.getKey()? 1 : -1).get().getKey();
        return strMap.get(maxKey);
    }

    private Integer strSize(String v) {
        Set<Character> unique = new HashSet<>();
        for(int i = 0; i < v.length(); i++){
            unique.add(v.charAt(i));
        }
        return unique.size();
    }

    public static void main(String [] args){
        List<String> input = Arrays.asList("ROMEO", "EMINEM", "RADO");
        System.out.println(new UniqueCharacters().largestString(input));
    }

}
