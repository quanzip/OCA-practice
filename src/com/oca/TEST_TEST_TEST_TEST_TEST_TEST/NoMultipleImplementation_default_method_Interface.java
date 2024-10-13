package com.oca.TEST_TEST_TEST_TEST_TEST_TEST;

/*  java do not allow multiple implementation, which lead to DIAMOND OF DEATH
*   if 2 interface has 1 default method in each, 1 class implement that interface, that class must override that method in defind separate body itself
*   normally, class implement interface which has defualt method do not have to override that method, but when multiple override default method, it gotta do
* */

public class NoMultipleImplementation_default_method_Interface implements I1, I2 {
    @Override
    public void showName() {
        System.out.println("Sub class showname");
                I1.super.showName();
                I2.super.showName();
    }

    public static void main(String[] args) {
        new  NoMultipleImplementation_default_method_Interface().showName();
    }
}
interface I1 {
    default void showName() {
        System.out.println("I1");
    }
}

interface I2 {
    default void showName() {
        System.out.println("I2");
    }
}
