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
    }
}
