package com.random.questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Amex {

    public static void main(String[] args) {

        String dictionary = "Mary had a little lamb its fleece was white as snow;\n" +
                "        And everywhere that Mary went, the lamb was sure to go.\n" +
                "                It followed her to school one day, which was against the rule;\n" +
                "        It made the children laugh and play, to see a lamb at school.\n" +
                "                And so the teacher turned it out, but still it lingered near,\n" +
                "        And waited patiently about till Mary did appear.\n" +
                "        \"Why does the lamb love Mary so?\" the eager children cry;\"Why, Mary loves the lamb, you know\" the teacher did reply.\"";

        List<String> strings = new ArrayList<>();
        strings.add("foo");
        strings.add(null);
        strings.add("bar");
        strings.add("Hello, World!");
        strings.add("13 characters");
        strings.add("Welcome to coderanch");
        strings.add("");
        strings.add("FizzBuzz!");
        strings.add("This pad is running Java 8.");

        //System.out.println(strings);

        List<String> resultList = new ArrayList<>();

        for (String str : strings) {

            if( str != null && !str.equals("") && str.length() <= 13 )
            {
                resultList.add(str);
            }

            if( (str != null) && (str != "") && !(str.length() > 13) )
            {

                resultList.add(str);
            }

        }
        Collections.sort(resultList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });
        // using lambdas
        //Collections.sort(resultList, String::compareToIgnoreCase);

        for (String string : resultList) {
            System.out.println(string);
        }
    }
}
