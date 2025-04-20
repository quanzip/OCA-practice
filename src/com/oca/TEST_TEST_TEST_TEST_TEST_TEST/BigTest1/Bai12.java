package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.BigTest1;

public class Bai12 {
    public static void main(String[] args) {
        int[]bai1, bai2[];
        int bai3[];
        int[] bai4[];

        bai1 = new int[]{1, 2}; // 1 chieu   // day la khoi tao gia tri,
        // khi khai bao khong khoi tao luon se phai lam nhu nay, neu khoi tao luc khai bao thi co the bai1 = {1,2}

        bai2 = new int[][]{};  // 2 chieu

        // phai gan dung loai mang, khong the gan 1 chieu cho 2 chieu hoac 2 chieu cho 1 chueu.
        bai3 = new int[3];
        bai1 = bai3;


        bai4 = new int[1][];
        bai2 = bai4;

        int []bai5[]; // mang 2 chieu
    }
}
