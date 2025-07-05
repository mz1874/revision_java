package com.java.eight.fucntionalInterfaceAndLambda;

import java.util.function.Predicate;

public class PredicateR {
    public static void main(String[] args) {
        /**
         * 断言用于判断和测试,数据是否满足被测试条件
         */
        Predicate<String> isEmpty = str -> str == null || str.isEmpty();
        System.out.println(isEmpty.test(""));  // true
        System.out.println(isEmpty.test(" ")); // false “ ”
    }
}
