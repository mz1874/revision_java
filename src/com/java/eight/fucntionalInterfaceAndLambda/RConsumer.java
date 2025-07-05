package com.java.eight.fucntionalInterfaceAndLambda;

import java.util.function.Consumer;

/**
 * Consumer 主要用于“消费”,
 * 即no return的方法类型
 */

public class RConsumer {

    private static void saySomeThings(String words) {
        System.out.println(words);
    }
    private static void doubleSize(String str) {
        System.out.println(2 * str.length());
    }
    public static void main(String[] args) {
        Consumer<String> consumer = RConsumer::saySomeThings;
        Consumer<String> integerConsumer = RConsumer::doubleSize;
        // 支持链式调用, 但是返回的是一个新的consumer
        Consumer<String> then = consumer.andThen(integerConsumer);
        then.accept("hello");
    }




}
