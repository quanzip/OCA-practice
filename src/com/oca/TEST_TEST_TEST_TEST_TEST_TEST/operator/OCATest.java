package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.operator;

import java.util.Scanner;

public class OCATest {
    public static void main(String[] args) {
        preAndPostDifference();
        booleanLogicShortCircuitOps();
        booleanBitwiseOps();
        compareStrings();
    }

    public static void preAndPostDifference(){
        int x=5, y = 10;
        System.out.println("The value of x is " + x);
        System.out.println("The value of ++x is " + ++x);
        System.out.println("The value of x++ is " + x++);
        System.out.println("The value of x is " + x);

        System.out.println("The value of y is " + y);
        System.out.println("The value of --y is " + --y);
        System.out.println("The value of y-- is " + y--);
        System.out.println("The value of y is " + y);
    }

    public static void booleanLogicShortCircuitOps() {
        System.out.println("Bai 2");
        boolean  b = false;
        int c = 3;
        if (c < 3 && (b = true)) {}
        System.out.println(b);
        if (c > 0 || (b = true)) {}
        System.out.println(b);
    }


    // && || : logic operator: khi so sánh, nếu chỉ 1 vế thỏa mãn hoặc không thỏa mãn, sẽ không cần kiểm tra thêm về còn lại
    //  & | ^: bitwíse operator: khi so sánh, JVM luôn chạy hết business của 2 vế, kể cả khi 1 trong 2 vế không thỏa mãn trước
    public static void booleanBitwiseOps(){
        boolean  b = false;
        int c = 3;
        if (c < 3 & (b = true)) {}
        System.out.println(b);
        if (c > 0 | (b = true)) {}
        System.out.println(b);
        if (c > 1 | c %2 == 1) {
            System.out.println("true");
        }
    }


    // khi dùng scanner để nhập giá trị biến, biến luon được tạo mới trong bộ nhớ, => so sánh == luôn trả false
    public static void compareStrings(){
        Scanner scanner = new Scanner(System.in);
        String s1, s2;
        System.out.println("Input s1");
        s1 = scanner.nextLine();

        System.out.println("Input s2");
        s2 = scanner.nextLine();

        System.out.println("So sanh == " + s1 == s2);
        System.out.println("So sanh Equal " + s1.equals(s2));
    }
}
