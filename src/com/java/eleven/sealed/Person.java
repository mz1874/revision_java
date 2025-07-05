package com.java.eleven.sealed;

/**
 * 非密封类, 继承自Human
 */
public non-sealed class Person extends Human {

    @Override
    void sayHello() {
        super.sayHello();
    }

    @Override
    protected void sayNo() {
        super.sayNo();
    }
}
