package com.random.questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UniqueWords {

    public static void main(String [] args){

        List words = new ArrayList<String >();
        words.add("stack");
        words.add("stack");
        words.add("over");
        words.add("over");
        words.add("flow");
        words.add("flow");
        System.out.println(uniqueWords(words));
    }

    /**
     * show distinct words from the list
     * @param words
     * @return
     */
    public static int uniqueWords(List<String> words){
        List uniqueList = new ArrayList<String>();
        Set uniqueSet = new TreeSet();
        uniqueSet.addAll(words);
        for(String eachWord : words){
            if(! uniqueList.contains(eachWord)){
                uniqueList.add(eachWord);
            }
        }
        System.out.println("Java 8 Stream API's "+ words.stream().distinct().count());
        System.out.println(uniqueSet);
        return uniqueList.size();
    }
}
