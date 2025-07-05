package com.java.eleven;

import com.java.eleven.inter.SayHello;

/**
 * 通常记录类被应用到DTO上, 因为默认封装好 getter等方法
 * 不可变性
 * @param title
 * @param author
 * @param isbn
 */
public record Book(String title, String author, String isbn) implements SayHello {

    @Override
    public void sayHello() {
        //允许record拥有自己的方法
    }


}

