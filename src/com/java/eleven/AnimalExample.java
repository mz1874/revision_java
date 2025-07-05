package com.java.eleven;

class Animal {
    public void speak() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("Bark!");
    }
}

class Cat extends Animal {
    @Override
    public void speak() {
        System.out.println("Meow!");
    }
}

public class AnimalExample {
    public static void main(String[] args) {

        Animal animal = new Dog();
        String response = switch (animal) {
            case Dog d -> {
                d.speak(); // 调用 Dog 的 speak 方法
                yield "It's a dog!";
            }
            case Cat c -> {
                c.speak(); // 调用 Cat 的 speak 方法
                yield "It's a cat!";
            }
            default -> {
                animal.speak(); // 调用 Animal 的 speak 方法
                yield "It's an unknown animal!";
            }
        };
        System.out.println(response);


        String str = null;
        String result = switch (str) {
            case null -> "Input is null";
            case "Hello" -> "Hello there!";
            case "Goodbye" -> "Goodbye!";
            default -> "Unknown input";
        };
        System.out.println(result); // 输出: Input is null
    }
}
