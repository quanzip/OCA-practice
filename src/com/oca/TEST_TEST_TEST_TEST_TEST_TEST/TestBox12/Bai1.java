package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.TestBox12;
/*
* New thing: native keyword, only on METHODS, that method can not have body
*
* */
public class Bai1 {
     public static void main(String[] args) {
        System.out.println(new MN().x + ", " + new MN().y);

        ABCD a = new MN();
        System.out.println(a.x + ", " + a.y);
        a.nativeMethod();

    }

    native private void newThing();

    class Subclass {

    }

     final class Quan extends D {
         native public String showname();   // new knowledge
     }

    static class D {
        String name;
    }
}

class ABCD {
    private String name=  "quan";
    int x = 10;
    static int y = 20;
     int t = 30;

     ABCD() {

     }

     native public void nativeMethod();
//     ABCD(String s) {
//
//     }
}

final class MN extends ABCD {
    int x = 50;
    static int y = 100;
    MN() {
        //name = "qwjiol";  error because name is private, chỉ có thể sd in ABCD
    }
}

interface II {
    // protected void go();   can not be protectd
}

abstract class X implements II {
    // abstract class là 1 class nên nó phải implement interface, không thể implement
}

interface ff {

}

interface vv extends ff, II {  // interface có thể extends nhiều, còn class thì chỉ có thể extends 1 class/abs clas

}
