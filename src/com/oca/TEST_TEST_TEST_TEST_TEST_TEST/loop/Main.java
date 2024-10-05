package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.loop;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        switch(Integer.parseInt("33")) {
            case 1:
                boolean d= true;
                break;
            case 33:
                d = true;
        }

        String  name = "hehe";
        switch(name) {
            case "toafn":
                System.out.println("Not");
                break;
        }

        int[] numbers = new int[]{1,23,4};
        for (long l: numbers) {
            System.out.println(l); // ok
        }
//        for (var r : numbers) {  var is not valid
//            System.out.println(r);
//        }
//        List<Float> floats = Arrays.asList(45f,4234f);
//        for (var f : floats) {
//            System.out.println(f);
//        }
    }
}
