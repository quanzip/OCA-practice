package com.oca.cónition;

/*
 * There are two types: basic for loop: for (;;), enhance for (x: Y)
 * Vói basic for loop, phần thứ nhất initialization phải chứa các biến có cùng kiểu, không được mix types
 * */
public class forLoop {
    public static void main(String[] args) {
        for (int a = 1; a < 10; a++) ; // ok
        //for (int a = 1, b = 2; ; ) // ok
          //  System.out.println(a);
      //  for(int a = 1, short k = 10; a < 20; a++) {} // errror because initialization contain mixed types

        System.out.println("ENHANCE FOR LOOP: easy for loop iteration");
        /*
        * use with array/collection (list/set)
        * each element must have same time with array
        * */
        String []strings = new String[]{"quan", "asdsad"};
        for (String element: strings) {
            System.out.println(element);
        }

        System.out.println("LABLE LOOP: ");
        // LABLED LOOP
        OUTTER_LOOP:
        for(String c : strings) {
           INNER_LOOP: for (String d: strings) {
               System.out.println(c + "-" + d);
            if (d.equals("asdsad")) break OUTTER_LOOP;
            if (d.equals("quan")) break INNER_LOOP;
           }
        }
    }
}
