package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.method;

public class TestMethodSignature {
    public static void main(String[] args) {

    }

    int a = 10;
    static String name = "Quan";

    void doSomeThing(){
        System.out.println("DO no thing");
    }

    static void show() {
        System.out.println("Ok");
        //a = a + 1;    invalid
//        doSomeThing(); invalid

        name = "new Name";
    }

    class SubClass {
        int getF(int g) {
            show();
            return g;
        }

        // differ signature from above method
        int getF(String g) {
            return 3;
        }

        // similarity of signature from first method, => invalid
//        float getF(int g) {
//            return 3f;
//        }

        // similarity of signature from the first method. => invalid
//        private String getF(int h) {
//
//        }


    }
}
