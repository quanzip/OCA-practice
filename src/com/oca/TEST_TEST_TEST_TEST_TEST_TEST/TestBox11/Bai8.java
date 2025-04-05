package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.TestBox11;

public class Bai8 {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.i);  // 20
        System.out.println(((A)b).i);  // 10
    }
}
class A {
    final int i = 10;
}
class B extends A {
    int i = 20;
}