package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.Polimorphism_invocation_method_static_or_instance;

import java.io.IOException;
import java.util.Calendar;

/*
 * khi kế thừa, gọi phương
 * */


interface I1 {
    String name = "interface";

    static void showInfo() {
        System.out.println("INTERFACE: Static method from interface");
    }

    void showToday();

    default void showName() {
        System.out.println("INTERFACE: Default method from interface");
    }
}

public class Main extends AbClass implements I1 {
    String name = "Main";

    public static void main(String[] args) {
        I1 i1 = new Main();
        i1.showName();
        i1.showToday();
        System.out.println(i1.name);

        Main main1= new Main();
        main1.showName();
        main1.showToday();
        System.out.println(main1.name);
    }

    // if this method is commented, then program will use parent's method
    public void showName() {
        System.out.println("SUB class:instance method from class Main");
    }

    @Override
    public void showToday() {
        System.out.println(Calendar.getInstance().getTime());
    }

    @Override
    Main getAdd() throws Exception {
        String s = "asd";
        if (s.length() > 1) {
            // không thể throw exception lớn hơn của cha, mà phải nhỏ hơn.
            throw new IOException();
        }
        return null;
    }
}

abstract class AbClass {
    static void showInfo() {
        System.out.println("ABSTRACT: Static from abstract class");
    }

    protected abstract void showToday();

    abstract Object getAdd() throws Exception;
}
