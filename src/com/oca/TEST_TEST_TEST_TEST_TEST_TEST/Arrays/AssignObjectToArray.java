package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.Arrays;

import java.util.concurrent.LinkedTransferQueue;

public class AssignObjectToArray {
    int  b;
    int c = b;  // ok
    public static void main(String[] args) {
        int b;
        // int c = b;  Error because b is not initialized

        int a[][] = new int[1][1];
        a[0][0] = 1;
        Object o = a;
        Object o1[] = a;
        System.out.println(o1[0]);

        int a1[] = new int[]{1};
        Object o2 = a;
        Object o3[] = a;
       // Object[] o4 = new int[2]; // error

        String []s = new String[]{""};
        s[0] = "quan";
        Object f[] = s;
        Object f2 = s;


    }
}
