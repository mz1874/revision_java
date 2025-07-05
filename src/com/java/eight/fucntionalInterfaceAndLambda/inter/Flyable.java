package com.java.eight.fucntionalInterfaceAndLambda.inter;

public interface Flyable {

    default void fly() {
        System.out.println("Flyable");
    }

}
