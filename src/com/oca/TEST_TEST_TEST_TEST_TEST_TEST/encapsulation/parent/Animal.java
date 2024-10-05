package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.encapsulation.parent;

public class Animal {
    private String name;
    protected String kind;

    public Animal(String name, String kind) {
         this.name = name;
         this.kind = kind;
    }

    protected Animal(String name) {
        this.name = name;
    }

    Animal(String kind, int legCount) {
        this.kind = kind;
        System.out.println("LegCount: " + legCount);
    }

    String showKind() {
        return this.kind;
    }

    protected String showName() {
        return this.name;
    }
}
