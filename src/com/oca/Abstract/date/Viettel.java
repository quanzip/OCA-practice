package com.oca.Abstract.date;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Calendar;
import java.util.TimeZone;

public class Viettel {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        ZoneId of = ZoneId.of("Asia/Ho_Chi_Minh");
        ZoneId of1 = ZoneId.of("Asia/Tokyo");

        Calendar calendar = Calendar.getInstance();
        TimeZone timeZone =calendar.getTimeZone();

        System.out.println(LocalDateTime.now());
        System.out.println(LocalDateTime.now(of));

        ZoneOffset offset = of.getRules().getOffset(LocalDateTime.now());
        ZoneOffset offset1 = of1.getRules().getOffset(LocalDateTime.now());
        System.out.println("1 " + LocalDateTime.now().atZone(of).toInstant().toEpochMilli());
        System.out.println("2 " + LocalDateTime.now(of).toInstant(offset).toEpochMilli());
        System.out.println("3 " +LocalDateTime.now(of).toInstant(offset));
        System.out.println(" " +offset);
        // => Hien tai mac dang chay voi GMT +7, neu set zoneId lon hon => thi h se giam di thay vi tang len

        System.out.println("\n -----------------------");

        long startOffsetInMili = LocalDateTime.of(2024 , 4, 2, 7, 5, 0).atZone(of).toInstant().toEpochMilli();
        System.out.println("HCM " + Instant.ofEpochMilli(startOffsetInMili));
        System.out.println("HCM " + LocalDateTime.of(2024 , 4, 2, 7, 5, 0).atZone(of).toInstant());
        System.out.println(startOffsetInMili);


        long startOffsetInMili1 = LocalDateTime.of(2024 , 4, 2, 7, 5, 0).atZone(of1).toInstant().toEpochMilli();
        System.out.println("Jp " + startOffsetInMili1);
        long startOffsetInMili0 = LocalDateTime.of(2024 , 4, 3, 7, 5, 0).atZone(of).toInstant().toEpochMilli();
        System.out.println("0 " + startOffsetInMili0);

        System.out.println("\n");
        long startOffsetInMili2 = LocalDateTime.of(2024 , 4, 1, 17, 56, 0).toInstant(offset).toEpochMilli();
        System.out.println("HCM " + Instant.ofEpochMilli(startOffsetInMili2));
        System.out.println(startOffsetInMili2);


        long startOffsetInMili3 = LocalDateTime.of(2024, 4, 1, 17, 56, 0).toInstant(offset1).toEpochMilli();
        System.out.println("Jp " + startOffsetInMili3);
    }
}
