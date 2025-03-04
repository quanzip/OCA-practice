package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.exceptionn;

/*
* khi sd try catch finally, phai luon co try-catch hoac try-finally hoac try catch finally, du trong try co return nhung neu co sd finally thi van chay xuong finally sau cung
* gia tri return trong try hoac catch se khong dung, ma dung gia tri return trong finally cho method
* */
public class TestFinally {
    public static void main(String[] args) {
        System.out.println(getString());  // Bo Tuan
    }

    private static String getString() {
        try {
            return "quam";
        } catch (Exception e) {
            return "Me Thu";
        } finally {
            return "Bo Tuan";
        }
    }
}
