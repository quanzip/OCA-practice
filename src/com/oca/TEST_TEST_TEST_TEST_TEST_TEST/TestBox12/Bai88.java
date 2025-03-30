package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.TestBox12;

public class Bai88 {
    public static void main(String[] args) {

    }

    static class CC {
       private static String name = "quan";
    }

    class SubC extends CC {
        public void show() {
            //name = "quan";   // name is private, can only be used in CC
        }
    }
}

interface IIC {
     final static int score = 23; // final static public is default

    default void changeStaticVar() {
//        score = 33; // error because var is public static final
    }

    void showName();
}


