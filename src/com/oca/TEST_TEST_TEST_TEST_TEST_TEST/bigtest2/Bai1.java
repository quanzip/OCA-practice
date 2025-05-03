package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.bigtest2;

import java.io.IOException;

public class Bai1 {
    public static void main(String[] args) {

    }
}

interface Bar{
    static int[] x = new int[0];
    static void bar(){}
}
abstract class FooBase{
    public static void bar(){
        int[] x = new int[0];
        System.out.println("In static bar");
    }
}
class Foo extends FooBase implements Bar {
    void method1() throws java.io.IOException, NullPointerException {
        someMethod("arguments");
        // some I/O operations

        System.out.println("Ok");
    }

    int someMethod(String str) {
        if (str == null) throw new NullPointerException();
        return 1;
    }
}

class PortConnector {
    public PortConnector(int port) throws IOException {
        if (Math.random() > 0.5) {
            throw new IOException();
        }
        throw new RuntimeException();
    }
}