package com.java.eight.fucntionalInterfaceAndLambda.lambda;

import javax.naming.PartialResultException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student {
    private int age;
    private String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

/**
 * 创建一个包含学生对象的列表，使用流操作找出所有年龄大于10的学生。
 * 将列表中的字符串转换为大写。
 * 计算列表中所有学生的总年龄。
 * 使用 flatMap 将多个列表中的元素合并成一个流。
 */
public class Demo {
    public static void main(String[] args) {
        Student student1 = new Student(1, "abc");
        Student student2 = new Student(2, "def");
        Student student3 = new Student(3, "ghi");
        Student student4 = new Student(4, "jkl");
        Student student5 = new Student(5, "ssj");
        Student student6 = new Student(6, "seio");
        Student student7 = new Student(7, "swu");

        List<Student> students = Arrays.asList(student1, student2, student3, student4, student5, student6, student7);

        for (String s : students.stream()
                .filter(student -> student.getAge() > 5)
                .map((student) -> student.getName().toUpperCase()).toList()) {
            System.out.println(s);
        }

        int sum = students.stream().mapToInt(student -> student.getAge()).sum();
        System.out.println("所有学生的年龄:\t"+  sum);

        //合并流
        List<Student> students1 = Arrays.asList(student1, student2);
        List<Student> students2 = Arrays.asList(student3, student4);
        List<Student> students3 = Arrays.asList(student5, student6, student7);

        /**
         * 合并成一个流
         */
        List<Student> allStudents = Arrays.asList(students1, students2, students3)
                .stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
    }
}
