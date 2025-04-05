package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.TestBox11;

public class Bai6 {
    public static void main(String[] args) {
        boolean a = false;
        boolean b = false;
        boolean c = true;
        if (a && b || c) System.out.println("bo1: " + "OK");  // gom nhom a vs B, and c tach rieng

        boolean d = true;
        if (a && b && d || c) System.out.println("bo2: " + "OK"); //  gom nhom a b, d , C tach rieng

        if (a || c && b) System.out.println("bo3 :" +  "OK");  // gom nhom c, b va nhom a rieng.

        if (a && b || c && d) System.out.println("bo4 :" +  "OK");  // gom nhom a,b va nhom 2: c , d
    }
}
