package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.Arrays;

import java.util.Objects;
import java.util.Random;

/*
mảng luôn được lưu trữ tại heap, kể cả mảng của các kiểu nguyên thủy hay kiểu object
* Với kiểu mảng 2 chiều, có thể khai báo int []a[] = new int[X bắt buộc][Y không bắt buộc];  nếu không có cả x và Y, thì phải định nghĩa rõ phần tử nào có trong mảng luôn {1,2,4,56}
* trước khi dùng var ở đâu phải initial trước, nếu không sẽ compile error đối với function var, còn đối với class vả, thì không cần vì class var có thể được assign tỏng các function sau
* còn function var là cục bộ, sẽ không thể dùng bên dưới nếu bên trên chưa được khai báo.`

* Có thể khai mảng arays of arrays of arrays  int [][][]a = ...
* * */
public class Types {
    public static void main(String[] args) {
        String x[];
        int m[] = new int[4];  // Phải chỉ rõ số lượng nếu không chỉ định mảng rỗng
        int m1[] = new int[]{1,3,4}; // Chỉ định mảng rỗng thì không cần khai báo số lượng cho phép

        int [] a [] ;
        int [] b [] = new int[][]{{}};
        Object c = new long[4];
        ((long[]) c)[0] =1;
        // Object d[] = x; // error because x is not initialized


        StaticNestClass staticNestClass;

        System.out.println(c.toString());
        System.out.println(m1);
    }

    public static class StaticNestClass {

    }

    protected class StaticNestClas1s {

    }

}

// chỉ có thể là default, hoặc public, mà ở trên đã có public rồi (trong file chỉ có1 class public nên class này phải là private)
class Exu {}