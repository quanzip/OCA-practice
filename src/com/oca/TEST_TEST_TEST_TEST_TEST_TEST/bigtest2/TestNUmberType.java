package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.bigtest2;

public class TestNUmberType {
    public static void main(String[] args) {
        char c = 'Z';
        long l = 100_00l;
        int i = 9_2;
        float f = 2.02f;
        double d = 10_0.35d;
        l = c + i;
        f = c * l * i * f;
        f = l + i + c;
        i = (int)d;
        f = (long)d;


        new S().ho(null);
    }
}

class S {
    void ho(TestNUmberType s) {
        System.out.println(s);
    }
}