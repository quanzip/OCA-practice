package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.testInterfaceCallDefaultMethod;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.show();
        // can not call default method from parent (interface) directly from dog instance
        // if Class dog also declare show method (interface has default method: show())
        // so we have to call like this.
        dog.showFromParent();
    }
}

interface Animal {
    String name = "Animal interface";
    default void show() {
        System.out.println("Default medthod in interface");
    }
}

class Dog implements Animal{
    public void show() {
        System.out.println("Dog show method");
    }

    void showFromParent() {
//        this.show();
        Animal.super.show();
    }
}
