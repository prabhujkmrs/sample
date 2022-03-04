package com.random.questions;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Stack = LAST IN FIRST OUT (LIFO)
 * Implement Stack only using queues
 */

public class StackUsingQueue {

    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();

    private static int stackSize;

    private StackUsingQueue(){
        stackSize = 0;
    }

    public static void main(String [] args){
        StackUsingQueue obj = new StackUsingQueue();
        obj.push(100);
        obj.push(200);
        obj.push(300);

        System.out.println(obj.top());

    }

    private void push(int x){
        q2.add(x);
        stackSize++;
        while (!q1.isEmpty())
        {
            q2.add(q1.peek());
            q1.remove();
        }
        Queue<Integer> q = q1;
        q1 = q2;
        q2 = q;
    }

    private void pop(){
        if (q1.isEmpty())
            return;
        q1.remove();
        stackSize--;

    }
    private int top(){
        return q1.isEmpty() ? -1 : q1.peek();
    }

    private int size(){
        return stackSize;
    }
}
