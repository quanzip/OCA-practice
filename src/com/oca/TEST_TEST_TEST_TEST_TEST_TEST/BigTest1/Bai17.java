package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.BigTest1;

public class Bai17 {
    public static void main(String[] args) {
        int [][]i = {{1,2}, {1,3,4}};
        System.out.println(i);

        i[2]= new int[]{4, 5, 6, 7}; // error,  Khi đã khai báo int [][]i = {{1,2}, {1,3,4}}; là đã gán cứng size của mảng 2 chiều là 2 hàng 3 cột, không thể thêm.
        System.out.println(i);
    }
}
