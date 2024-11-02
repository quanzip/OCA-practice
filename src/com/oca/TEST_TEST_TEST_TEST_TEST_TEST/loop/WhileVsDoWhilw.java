package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.loop;

public class WhileVsDoWhilw {
    public static void main(String[] args) {
        int  m = 10;
        int i =0;
        OK:do {
            if (i++ == 5) continue;

            ZIP: System.out.println(i);
             // if (i == 6) continue ZIP; else i++; compile error because zip is not a loop, so can not use continue or break
        } while (i < m);

        // Compile errror because while do not allow false as hard condition
//        while (false) {
//            System.out.println("quan");
//        }

        // OK
        if (false) {
            System.out.println("quan");
        }
        do {
            System.out.println("quan");
        } while (false);
        for(int g = 10; check(g);) {
            System.out.println("quan");
        }
    }

    private static boolean check(int g) {
        for (;;) { // ok
            System.out.println("ok");
            return true;
        }
//        return false;
    }
}
