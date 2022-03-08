package com.leet.problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StarAndHyphen {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String input = reader.readLine();

            StringBuilder builder = new StringBuilder();
            int i = 0;
            builder.append(input.charAt(0));
            while (i < input.length() -1){

                int v1 = Integer.parseInt(String.valueOf(input.charAt(i)));
                int v2 = Integer.parseInt(String.valueOf(input.charAt(i+1)));

                if(v1 != 0 && v2 != 0 && v1 % 2 == 0 && v2 % 2 == 0)
                    builder.append("*");
                else if(v1 % 2 != 0 && v2 % 2 != 0)
                    builder.append("-");

                builder.append(input.charAt(i+1));
                i++;
            }
        System.out.println(builder.toString());

    }
}
