package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.Part5Test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LocalDatee {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        localDate.minus(1, ChronoUnit.DAYS);  // phương thức minus / plus thì sẽ tạo 1 Object mới(new) của localDate và return Object mới đó chứ không phải reference của Object gốc.
    }
}

