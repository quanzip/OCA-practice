package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.bigtest2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Bai1 {
    public static void main(String[] args) {
        FooBase.bar();
        args = new String[1];  // Neu ko dc gan lai thi ko the truy cap args[0] -> mang trong main func co dinh size
        args[0] = "aisd";
        System.out.println(args[0].toUpperCase(Locale.ROOT));  // null pointer Ex
        System.out.println(args[0]);
//        throw null; // compile ok, run throw NPE

        System.out.println("SbuString--------------------");
        String q = "quan";
//        System.out.println(q.substring(1,10)); StringIndexOutOFBoundEx, ko the substring with endIndex lager than length

        FooBase f = null;
        Foo f1 = (Foo) f;
        f1.showName();
        System.out.println(f1.name);

        List<String> list = new ArrayList<String>() {{add("asd"); add("3o");}};
         list.subList(0, 10);// errpr  need to work more

        StringBuilder stringBuilder = new StringBuilder("quan");
//        stringBuilder.substring(1, 100); eror
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

    static String name = "Foo";
    static void showName() {
        System.out.println(name);
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