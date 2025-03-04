package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.Arrays;
/*
* Khi khai báo bảng với {X,Y,Z} hoặc dùng phương thức valueOf(X) thì sẽ check trong cache trước, nếu có trong cache rồi thì lấy trong cache
* */
public class CountCreatedObjectInArray {
    public static void main(String[] args) {
        Integer []A = {1,2,4};
        Integer []B = {1,2,4};

        System.out.println(A[0] == B[0]); // true => b using value để tiết kiệm thời gian, bộ nhớ và hiệu suất, lấy chúng ra tỏng cache
    }
}
