//package com;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world");

        Stack stack = new Stack();

        stack.push(6);
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("Stack size:" + stack.size());
        System.out.println("Stack peek:" + stack.peek());
        System.out.println("Stack pop:" + stack.pop());
        System.out.println("Stack peek:" + stack.peek());
        System.out.println("Stack size:" + stack.size());

    }
}
