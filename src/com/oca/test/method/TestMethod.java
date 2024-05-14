package com.oca.test.method;

public class TestMethod {
    public static void main(String[] args) {

    }

    class SubClass {
        int getF(int g) {
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
