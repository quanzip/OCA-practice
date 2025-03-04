package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.Arrays;

 /*
 PRIMATIVE
 * Các biến kiểu short, byte, char có thể được gán cho int bởi chúng có thể được promoted to int
 * Nhưng với kiểu mảng thì không thể, mảng short[] không thể được gán cho mảng int []
 * int []d = new byte[]{1}   // ERROR

 OBJECT
 Có thể gán mảng kiểu con cho mảng của cha.
 vd Object d[] = new Integer[1];
 * */

public class ArrayReference {
    public static void main(String[] args) {
        int t = 'c';  // ok
        int g = (short) 4;  // ok

        short[] s = new short[]{2};
       // int i[] = s;    // not ok

        int ii[] = new int[] { 's', 11, (short)6,  (byte) 100}; // ok
    }
}
