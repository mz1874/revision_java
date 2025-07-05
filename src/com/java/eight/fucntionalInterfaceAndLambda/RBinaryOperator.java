package com.java.eight.fucntionalInterfaceAndLambda;

import java.util.function.BinaryOperator;

/**
 * 二元操作, 接收两个输入, 返回特定的输出
 */
public class RBinaryOperator {
    public static void main(String[] args) {
        // 字符串拼接
        BinaryOperator<String> binaryOperator = (a, b) -> a + "\t" + b;
        System.out.println(binaryOperator.apply("Hello", "World"));

    }
}
