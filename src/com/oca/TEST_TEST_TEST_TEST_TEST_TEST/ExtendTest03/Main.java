package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.ExtendTest03;

class B {}
class B1 extends B {
    String a;
}
class B2 extends B {
    String a;
}
public class Main {
    public static void main(String[] args) {
       B b= new B();
       B1 b1 = new B1();
       B2 b2 = new B2();
     // B1, b2 la b nhung B khong phai la B2,   B1 != B2, khong the gan cho nhau

      //  b = b1;  // ok
        // b2 = b;  // error
         b1 = (B1) b;  // error luc run time
//         b2 = (B2) b1; // error luc compile time
//          b1 = (B) b1;  // error luc compile time
        System.out.println(b1);
    }
}
