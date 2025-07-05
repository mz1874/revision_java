package com.java.eight.fucntionalInterfaceAndLambda.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Lambda 过滤
 */
public class RFilter {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5);
        //间接操作
        List<Integer> list = arr.stream().filter(i -> i > 3).toList();

        // 使用Collector to collect data
        List<Integer> list2 = arr.stream().filter(i -> i > 3).collect(Collectors.toList());

        //直接创建流式对象
        Stream<Integer> stream = list.stream();
        stream.forEach(System.out::println);
        list2.forEach(System.out::println);


    }
}
