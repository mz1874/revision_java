package com.java.eight.fucntionalInterfaceAndLambda;

import java.util.function.UnaryOperator;

/**
 * 一元操作接口, 提供同类型的数据操作
 */
public class RUnaryOperator {
    public static void main(String[] args) {
        UnaryOperator<Integer> unaryOperator = x -> x * 2;
        System.out.println(unaryOperator.apply(5));
    }
}
