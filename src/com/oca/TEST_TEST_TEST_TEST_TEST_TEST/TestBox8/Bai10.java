package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.TestBox8;

public class Bai10 {
    int y = getI();
    static int t = getI();
    public static void main(String[] args) {

    }

    static int getI()  {
        if (t > 100) {
            throw new IllegalArgumentException();
        }
        return 1;}
}
