package com.java.eleven;

public class TestRecord {
    public static void main(String[] args) {
        Book book = new Book("Effective Java", "Joshua Bloch", "978-0321356680");
        System.out.println("Title: " + book.title());    // 使用 getter 方法
        System.out.println("Author: " + book.author());
        System.out.println("ISBN: " + book.isbn());

        // 自动的 toString() 方法
        System.out.println(book);

        // 自动的 equals() 和 hashCode() 方法
        Book anotherBook = new Book("Effective Java", "Joshua Bloch", "978-0321356680");
        System.out.println(anotherBook == book);
        // equals 是通过hashCode 进行对比的, 所以如果两个对象完全一样(内容), 那么Equals将相等
        // 如果使用==的方式比较的话就是不相等了
        System.out.println("Are books equal? " + book.equals(anotherBook));
    }
}
