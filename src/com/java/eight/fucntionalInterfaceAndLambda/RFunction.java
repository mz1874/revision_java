package com.java.eight.fucntionalInterfaceAndLambda;

import java.util.function.Function;

/**
 * Function 接口
 * 接收数据输入, 和数据的输出, 提供复杂类型的数据转换功能
 */
public class RFunction {
    static Function<String, Integer> strToInt = str -> Integer.parseInt(str);

    public static void main(String[] args) {
        System.out.println(strToInt.apply("123"));
    }
}
