package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.BigTest1;

public class Bai11 {
    public static void main(String[] args) {
        get(new Integer(10));
        int t = 1;
        get(t);  // match long x param
        get(1,2);
        get(Long.valueOf(9l));
    }

    public static void get(int ...x) {
        System.out.println("int ...x " + x);
    }

//    public static void get(int x) {
//        System.out.println("int x " + x);
//    }

    public static void get(Integer x) {
        System.out.println("Integer x " + x);
    }

    public static void get(long x) {
        System.out.println("long x " + x);
    }

    public static void get(Long x) {
        System.out.println("Long x " + x);
    }
}
