package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.bigtest2;

import java.time.Period;
import java.util.ArrayList;

public class BigTest4Eror {
    public static void main(String[] args) {
        System.out.println("Bôlean-------------- ");
        Boolean b = new Boolean(null);
        System.out.println(b);

        System.out.println("DateTime----------");

        Period period = Period.of(0, 1000, 0);
        Period p1 = Period.of(0, 0, 0);
        Period p2 = Period.of(1, 0, 0);
        Period p3 = Period.of(1, 0, 1);
        System.out.println(period);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);


        System.out.println("List----------");
        Integer[] i = new Integer[1];
//        new ArrayList<>(){{add(i[0]);}}; // error
        new ArrayList<Object>(){{add(i[0]);}};  // ok null

        System.out.println("Loop-----------");
        final boolean flag ;
        flag = false;
        while(flag) {
            System.out.println("Good Morning!");
        }
    }
}

class As {
    private static void add(double d1, double d2) {
        System.out.println("double version: " + (d1 + d2));
    }

    private static void add(Double d1, Double d2) {
        System.out.println("Double version: " + (d1 + d2));
    }

    public static void main(String[] args) {
//        add(1.8, new Double(10.0));  Error because ambigous match, both matched methods

    }

}
