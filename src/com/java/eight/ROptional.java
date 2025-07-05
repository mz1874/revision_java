package com.java.eight;

import java.util.Optional;

/**
 * Optional 复习
 */

class Student {
    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

public class ROptional {

    static void asPresent(String value)
    {
        System.out.printf("asPresent");
    }

    static void asNotPresent()
    {
        System.out.printf("asNotPresent");
    }
    public static void main(String[] args) {

        Optional<Student> student = Optional.of(new Student(1, "张三", 11));// Not-null
        Optional<String> objectOptional = Optional.ofNullable(null);// may null
        Optional<Object> empty = Optional.empty();// empty

        objectOptional.ifPresentOrElse(ROptional::asPresent, ROptional::asNotPresent);

        /**
         * 使用Optional包装可能为空的对象，避免使用== null进行检查。
         * 使用ifPresentOrElse处理可能为空的对象。
         * 使用orElse和orElseGet提供默认值或默认操作。
         * 使用orElseThrow抛出自定义异常。
         */
        empty.ifPresentOrElse(System.out::println, ROptional::asNotPresent);

        // 如果当前值是存在的话, 即返回当前值, 如果不存在的话则返回1
        empty.orElse(1);

        //如果当前值存在的话, 返回, 否则返回Supply
        empty.orElseGet(() -> 1);

        //
        empty.orElseThrow(() -> new RuntimeException("empty"));
    }
}
