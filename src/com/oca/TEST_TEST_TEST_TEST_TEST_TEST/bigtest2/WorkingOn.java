package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.bigtest2;

import java.util.ArrayList;
import java.util.List;

public class WorkingOn {
    private static void add(double d1, double d2) {
        System.out.println("double version: " + (d1 + d2));
    }

    private static void add(Double d1, Double d2) {
        System.out.println("Double version: " + (d1 + d2));
    }

    public static void show(short r) {

    }

    public static void main(String[] args) {
        System.out.println("method-------- ");
        add(10.0, new Integer(10)); // Integer tự động được chuyển về int, int < double là cha nên tự động được nhận
        show((short)1); // need casting

// -- 5
        System.out.println("String------- ");
        final String fName = "James";
        String lName = "Gosling";
        String name1 = fName + lName;
        String name2 = fName + "Gosling";
        String name3 = "James" + "Gosling";
        System.out.println(name1 == name2);
        System.out.println(name2 == name3);
        // --  8
        System.out.println("------LÍST ");
        List<Integer> list = new ArrayList<>();

        list.add(27);
        list.add(27);  // auto boxing sang Integer.of(27) => luu vào trong menory,
        // chỉ áp dụng với value từ -128 ... 127, tương tự Short, Byte, Integer, Character, Boolean

        list.add(new Integer(27));
        list.add(new Integer(27));

        System.out.println(list.get(0) == list.get(1));
        System.out.println(list.get(2) == list.get(3));


        System.out.println("Byte over capacity");
        byte r = (byte) 128;
        System.out.println(r); // ok but turn to minus

        System.out.println("Tést list Short");
        List<Short> shorts = new ArrayList<>();
        shorts.add((short)23);
        shorts.add((short)23);

        shorts.add(new Short((short) 33));
        shorts.add(new Short((short) 33));
        System.out.println(shorts.get(0) == shorts.get(1));
        System.out.println(shorts.get(2) == shorts.get(3));
    }


}
