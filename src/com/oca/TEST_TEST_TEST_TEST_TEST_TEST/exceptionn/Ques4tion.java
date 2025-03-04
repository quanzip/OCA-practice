package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.exceptionn;

public class Ques4tion {
    public static void main(String[] args) {
        float f = Float.NaN;

        System.out.println(f);

        System.out.println("F" + (f +1));

        Double d = Double.NaN;
        System.out.println("D" + d);


        int i = (int) Float.NaN;
        System.out.println("I" + i);


        float f1 = (float) Float.NaN;
        System.out.println("F1" + f1);

        System.out.println("--------------Question4-------------");
        fin("0.1");
        fin("1");
        fin("0.x1");

    }

    public static float fin(String input){
        float res= 0.0f;
        try {
           res = Float.valueOf(input).floatValue();
            System.out.println(res);
           return res;
        } catch (NumberFormatException e) {
            res = Float.NaN;
            System.out.println("Invalid input, NAN");
            return res;
        } finally {
            System.out.println("finally");
        }
        // return res;   // unreach this line => compile error because try has return and catch either
    }
}
