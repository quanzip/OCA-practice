package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.Arrays;

import java.util.concurrent.LinkedTransferQueue;

public class AssignObjectToArray {
    int  b;
    int c = b;  // ok
    public static void main(String[] args) {
        int b;
        // int c = b;  Error because b is not initialized

        int a[][] = new int[1][2];
        a[0][0] = 1;
        a[0][1] = 5;
        Object o = a;
        Object o1[] = a;
        System.out.println("Gan mang object[] cho marng 2 chieu: "+ ((int[])(o1[0]))[1]); // mảng 2 chiều của primitive thực chất là mảng 1 chiều, nên có thể gán cho mảng 1 chiều object
        System.out.println("Gan object cho mang 2 chieu primative: " + ((int[][])o)[0][0]);

        int a1[] = new int[]{1};
        Object o2 = a1;
      //  Object o3[] = a1;  // eror vì mảng 1 chiều của primitive thực chất chỉ là 1 đối tượng, không thể gán cho 1 mảng đối tượngthể
        //  , chỉ có mảng 2 chiều mới có thể gán cho mảng 1 chiều object vì nó thực chất là mảng 1 chiều.
//        Object[] o4 = new int[2]; // error vì new int[2] chỉ là 1 đối tượng, không thể gán cho 1 mảng đối tượng.
        ((int[])(o2))[0] = 10;
        System.out.println("Gan object cho mang 1 chieu: "+ ((int[])o2)[0]);

        String []s = new String[]{""};
        s[0] = "quan";
        Object f[] = s;
        Object f2 = s;
        Object o4[] = new String[]{""};   // ok vi string la 1 object, mang string là mang object[] nen gan được

    }
}
