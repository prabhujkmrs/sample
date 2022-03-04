package com.random.questions;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsAPI {

     static class Person {
        String name;
        Integer netWorth;

        public Person(String name, Integer netWorth){
            this.name = name;
            this.netWorth = netWorth;
        }

    }

    public static void main(String [] args) {
        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person("Jeff Bezoz", 10000));
        personList.add(new Person("Warren Buffet", 8000));
        personList.add(new Person("Bill Gates", 6000));

        //select person with net worth greater than 5000
        List<Person> collect = personList.stream()
                .filter(person -> person.netWorth > 6000)
                .collect(Collectors.toList());
        collect.
                forEach(person -> System.out.println(person.name));

        // print person name in alphabetical order
        List<Person> ordered = personList.stream()
                .sorted(Comparator.comparing(person -> person.name))
                .collect(Collectors.toList());
        ordered.
                forEach(person -> System.out.println(person.name));

    }

}
