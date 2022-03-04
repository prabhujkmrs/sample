package com.random.questions;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    private static Map<Integer,Integer> map = new HashMap<Integer,Integer>();
    public static void main(String [] args){

        System.out.println("com.random.questions.Fibonacci normal implementation");
        fibonacci(10);
        System.out.println("com.random.questions.Fibonacci using Recursion");
        System.out.println(fibonacciRecursion(10));
        System.out.println("Three number add");
        fibonacciThreeNumberAdd(10);
        System.out.println("com.random.questions.Fibonacci Memoize");
        System.out.println(fibonacciMemoize(10));
    }

    public static void fibonacci(int num){
        if(num==0) {
            System.out.println(0);
            System.exit(1);
        }
        else if(num==1){
            System.out.println(1);
            System.exit(1);
        }
        else {
            int first = 0;
            int second = 1;
            System.out.println(second);
            for (int i = 1; i <= num; i++) {
                int current = first + second;
                System.out.println(current);
                first = second;
                second = current;
            }
        }

    }

    public static void fibonacciThreeNumberAdd(int num){

        int first =0;
        int second = 1;
        int third = 1;
        //System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        for(int i=1; i<=num ; i++){
            int current = first+second+third;
            System.out.println(current);
            first = second;
            second = third;
            third = current;
        }

    }

    public static int fibonacciRecursion(int num){
        if(num == 0) return 0;
        else if(num ==1) return 1;
        else
            return fibonacciRecursion(num -1) +fibonacciRecursion(num-2);
    }

    public static int fibonacciMemoize(int num){
        if(num == 0) return 0;
        if(num ==1) return 1;
        if(map.containsKey(num)) return map.get(num);
        int f;
        f = fibonacciRecursion(num - 1) + fibonacciRecursion(num - 2);
        map.put(num, f);
        return f;
    }

}
