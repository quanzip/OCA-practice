package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.bigtest2;

public class TéstInter {

}
interface X1 {
    default void print() {
        System.out.println("X1");
    }
    static void showStaticMsg() {
        System.out.println("Siper");
    }
}

interface X2 extends X1 {
    void print();
}

interface X3 extends X2 {
    default void print() {
        System.out.println("X3");
    }
}

class X implements X3 {}

 class Test {
    public static void main(String[] args) {
        X1 obj = new X();
        obj.print();
//        obj.showStaticMsg();
//        X.showStaticMsg();        Tat ca deu error vi static method cua interface chi goi dc tu reference cua interface do
//        X2.showStaticMsg();

        A a = A.OK;
        a.print();
    }
}

abstract class Aa{

}

enum A implements X1{
    OK("ok") {
        @Override
        void showName() {

        }
    };

    A(String name) {
//        int t = 1++; // 1 in invalid, require var
    }


    abstract void showName(); // neu da khai abstract method trong enum haoc ke thua interface co abstract method thi tat ca cac enum phai implement hcung
}
