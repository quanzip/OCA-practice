package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.TestBox12;

public class Bai4 {
    public static void main(String[] args) {
        C c = new C();
        c.show();


        BXX b = new BXX();
        b.j = 1000;
    }
}
class A {
    public int i = 1;
    protected int j = 10;
}
class BXX extends A{
    private int i = 9;
//    public int j = 44;

    public void changeJ() {
        j  = 10;
    }
}
class C extends BXX {
    public void show() {
        System.out.println(j);   //  I of B
    }
}