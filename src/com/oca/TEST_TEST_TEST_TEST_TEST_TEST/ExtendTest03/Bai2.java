package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.ExtendTest03;

public class Bai2 {
    public static void main(String[] args) {
        String s = null;
        s += "quan";   // ok
        System.out.println(s);

        Integer i = null;
        // i += 23;   // null pointer
        System.out.println(i);

        System.out.println("Compare string:-------------- ");
        String g = "abc";
        String gg = "abc";
        char []c = {'a', 'b',  'c'};

        String newStr = "";
        for(char cc: c) {
            newStr += cc;
        }

        System.out.println("G " + g + (g == gg));
        System.out.println("G " + g + " , newStr " + newStr + " " + (g == newStr)); // true
        System.out.println("Using equals" + g.equals(newStr));

        System.out.println("Compare string2:-------------- ");

        String dd = "quan";
        String ff = "qua";
        ff = ff + "n";
        System.out.println(dd == ff); // false

        System.out.println("Compare string3:-------------- ");
        String s3 = "hss";
        String rr = "hs" + "s";
        System.out.println(s3 == rr); // true

        System.out.println("Compare String 4 --------------");
        String fg= null;
        String fgg = " sa";
        String gff = fg + fgg;
        System.out.println(gff);
    }
}
