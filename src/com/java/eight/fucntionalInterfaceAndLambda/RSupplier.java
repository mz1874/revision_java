package com.java.eight.fucntionalInterfaceAndLambda;

import java.util.function.Supplier;

/**
 * Supplier 适用于延迟加载的情况,
 * 需要时调用. 并且可以作为参数传递给其他的函数式接口
 */
public class RSupplier {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Hello World";
        System.out.println(supplier.get());
    }
}
