package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.bigtest2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TestDate {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(1968,1,1,4,5,6);
        System.out.println("LocalDateTime " + localDateTime);

        LocalDate localDate = LocalDate.of(3847,  12, 3);
        System.out.println("LocalDate " + localDate);

        LocalTime localTime = LocalTime.of(14,43,33);
        System.out.println("LocalTime " + localTime);

        LocalTime localTime1 = LocalTime.MAX;
        LocalTime localTime2 = LocalTime.MIN;
        LocalTime localTime3 = LocalTime.MIDNIGHT;
        LocalTime localTime4 = LocalTime.NOON;
        System.out.println("LocalDate at LocalTime.MAX " + localDate.atTime(localTime1));
        System.out.println("LocalDate at LocalTime.MIN " + localDate.atTime(localTime2));
        System.out.println("LocalDate at LocalTime.MIdnight " + localDate.atTime(localTime4));

        System.out.println("quan " + (10 !=5)); // yêu cầu ()
        System.out.println("Toan " + 10 * 5); // có phép toán ưu tiên, ko cần ()

        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append(null); // errror Lỗi vì append nhận string hoặc stringBuilder, cả 2 đều đồng cấp là con của charsequencejava
//        , nên java k biết lấy method nào

        m1(null);// ok vì string < Charsequence < object do vì QH cha con như vậy nên java sẽ lấy được cấp thấp nhất để áp dụng
        // => string, nếu ko có string , sẽ lấy Charsequence
    }

    static void m1(CharSequence s) {
        System.out.println("CharSequence");
    }

    static void m11(String s) {
        System.out.println("String");
    }

    static void m1(Object s) {
        System.out.println("Object");
    }
}
