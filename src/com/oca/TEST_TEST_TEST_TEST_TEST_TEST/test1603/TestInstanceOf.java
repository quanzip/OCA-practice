package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.test1603;

public class TestInstanceOf {
    public static void main(String[] args) {
        A a = new C();
        C c = new C();
        D d = new D();

        System.out.println("a instanceof A " + (a instanceof A));
        System.out.println("c instanceof B " + (c instanceof B));
        System.out.println("c instanceof A " + (c instanceof A));
//        System.out.println("d instanceof C" + (d instanceof C)); Compile error vi C không trong cây kế thừa của D
    }
}

interface A {}
class B implements A{}
class C extends B {}
class D {
    public D(String s) {

    }

    public D() {

    }
}
class E extends D {

}