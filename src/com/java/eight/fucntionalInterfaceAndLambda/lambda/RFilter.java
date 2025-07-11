package com.java.eight.fucntionalInterfaceAndLambda.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Lambda 过滤
 */
public class RFilter {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 2, 3, 10, 4, 5, 2, 9, 3);
        //间接操作
        List<Integer> list = arr.stream().filter(i -> i > 3).toList();

        // 使用Collector to collect data
        List<Integer> list2 = arr.stream().filter(i -> i > 3).collect(Collectors.toList());

        //直接创建流式对象
        Stream<Integer> stream = list.stream();
        stream.forEach(System.out::println);
        list2.forEach(System.out::println);

        //sorting
        arr.sort(Comparator.comparingInt(a -> (int) a).reversed());
        System.out.println(arr);


        //从一个整数列表中过滤出偶数，并将它们平方后排序。
        List<Integer> collect = arr.stream().filter(number -> number % 2 == 0)
                .map(number -> number * number)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(collect);

        //计算一个整数列表中所有元素的乘积。
        Optional<Integer> reduce = arr.stream().reduce((a, b) -> a * b);
        reduce.ifPresent(System.out::println);


        //使用Map 对原本集合进行映射
        List<String> strings = arr.stream().map(String::valueOf).toList();
        System.out.println(strings.get(0) instanceof String);

        //对元素进行去重
        arr.stream().distinct().forEach(System.out::println);

        //跳过前两个元素
        arr.stream().skip(2).forEach(System.out::println);


        //匹配元素是否存在
        if (arr.stream().anyMatch(number -> number == 2)) {
            System.out.println("Matched");
        }

        //匹配最大元素
        arr.stream().max(Integer::compareTo).ifPresent(System.out::println);



    }
}
