package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.bigtest2;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class BigTest3 {
//        Boolean b = new Boolean();
//
//        List<String> s = new ArrayList<>();
//        s.set(1, "");
//
//        if (2 == 33) {
//
//        }
//        int [] arr1 = {5, 10, 15};
//        int [] arr2 = {'A', 'B'};
//        arr1 = arr2;
//
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append(null);
//
//
//        LocalDate date = LocalDate.parse("2000-06-25");
//        while(date.getDayOfMonth() >= 20) {
//            System.out.println(date);
//            date.plusDays(-1);
//        }
//
//        static Boolean[] arr = new Boolean[1];
//        public static void main(String[] args) {
//            if(arr[0]) {
//                System.out.println(true);
//            } else {
//                System.out.println(false);
//            }
//        }
//
//
//        private static void m1() {
//            System.out.println(1/0);
//        }
//
//        public static void main(String[] args) {
//            try {
//                m1();
//            } finally {
//                System.out.println("A");
//            }
//        }
//
//
//        static Double d1;
//        static int x = d1.intValue();
//
//        public static void main(String[] args) {
//            System.out.println("HELLO");
//        }
//
//
//        String fruit = new String(new char[] {'M', 'a', 'n', 'g', 'o'});
//        switch (fruit) {
//            default:
//                System.out.println("ANY FRUIT WILL DO");
//            case "Apple":
//                System.out.println("APPLE");
//            case "Mango":
//                System.out.println("MANGO");
//            case "Banana":
//                System.out.println("BANANA");
//                break;
//        }
//
//
//        System.out.println(1);
//        int []a = new int[2];
//        System.out.println(a);
//        String s[] = new String[1];
//        System.out.println(s);
//
//        int a = 20;
//        int var = --a * a++ + a-- - --a;
//        System.out.println("a = " + a);
//        System.out.println("var = " + var);
//
//
//        for(Counter ctr : arr) {
//            ctr.increase(-ctr.getCount() + 100);
//        }
//
//        LocalDate date = LocalDate.of(2000, Month.JANUARY, 1);
//        Period period = Period.parse("p-30000y");
//        System.out.println(date.plus(period));
//
//        Boolean b = new Boolean("tRUe");
//        switch(b) {
//            case true:
//                System.out.println("ONE");
//            case false:
//                System.out.println("TWO");
//            default:
//                System.out.println("THREE");
//        }
//    }

    public static void main(java.lang.String[] args) {
        List<String> strings = new ArrayList<>();
//        strings.remove(1); // array inDex OutOfBoundEx
//        strings.remove((short) 2);
        strings.remove(new BigTest3());
        strings.add(1, "");

        System.out.println("Boolean0--------------");
        Boolean b = new Boolean("tRue"); // true
        Boolean b1 = new Boolean("ok"); // false
        System.out.println(b);
        System.out.println(b1);

        System.out.println("Switch -----------------");
        java.lang.String fruit = new java.lang.String(new char[] {'M', 'a', 'n', 'g', 'o'});
        switch (fruit) {
            default:
                System.out.println("ANY FRUIT WILL DO");
            case "Apple":
                System.out.println("APPLE");
            case "Mango":
                System.out.println("MANGO");
            case "Banana":
                System.out.println("BANANA");
                break;
        }

        System.out.println("Operstors-------");
        int a = 20;
        int var = --a * a++ + a-- - --a;
        System.out.println("a = " + a);
        System.out.println("var = " + var);
//        =>  19 * 19 + 20 - 18.
//        System.out.println(1/0);

        System.out.println("Date----------------");

                LocalDate date = LocalDate.of(2000, Month.JANUARY, 1);
        Period period = Period.parse("p-30000y");
        System.out.println(date.plus(period));


        final Boolean bs = false;
        while (bs) {
            System.out.println();
        }
    }
//    static Double d;

//    static Integer i = d.intValue(); // throw ExInInitializer
private class XD {

}
class e extends  XD {

}
}
