package com.leet.problems;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class RepeatingDigits {

    public int countRepeatingDigits(int number){
        Map<Character, Integer> numMap = new HashMap<>();
        String str = String.valueOf(number);
        int i=0;
        while(i < str.length() ) {
            if(numMap.containsKey(str.charAt(i))){
                int val = numMap.get(str.charAt(i));
                numMap.put(str.charAt(i), val+1);
            } else {
                numMap.put(str.charAt(i),0);
            }
            i++;
        }
        int count = numMap.entrySet().stream().filter(a -> a.getValue() > 0).collect(Collectors.toList()).size();

        return count;
    }

    public static void main(String [] args) {
        System.out.println(new RepeatingDigits().countRepeatingDigits(6622677));
    }
}
