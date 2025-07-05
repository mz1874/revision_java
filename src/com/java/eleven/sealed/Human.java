package com.java.eleven.sealed;

/**
 * 密封类, 仅仅允许指定的类进行集成
 */
public abstract sealed class Human permits Person {

    void sayHello() {
        System.out.println("hello");
    };

    private void sayYes(){
        System.out.println("yes");
    }

    protected void sayNo(){
        System.out.println("no");
    }
}
