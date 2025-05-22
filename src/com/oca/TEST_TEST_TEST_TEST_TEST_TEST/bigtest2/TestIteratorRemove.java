package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.bigtest2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/*
* Chỉ có thể xóa khi duyệt mảng nếu dùng iterator
* */
public class TestIteratorRemove {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Quan");
        list.add("Thu");
        list.add("Toan");
        list.add("Tuan");

        System.out.println(list);
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
            iterator.remove();

//            String value = iterator.next();
//            list.remove(value);  // Error
        }
        System.out.println(list);

        List<Integer> list1 = new ArrayList<>();
        list1.add(new Integer(100));
        list1.add(new Integer(101));
        System.out.println(list1);
        list1.remove(new Integer(100));
        System.out.println(list1);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalTime localTime = LocalTime.of(23,22,33);
        LocalDate localDate = LocalDate.of(1755,3,10);
        System.out.println(localDate.atTime(localTime));
    }
}
