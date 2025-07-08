package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.LastTestBox;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class CheckUnknown {
    public static void main(String[] args) {
        int num = 10;
        if(num++ == num++) {
            System.out.println("EQUAL " + num);
        } else {
            System.out.println("NOT EQUAL " + num);
        }

        if (true) {
            System.out.println("asdjk");
        }
        if (false){
            System.out.println("Asd");
        }

        System.out.println("List");
    }
}
interface Flyable1 {
    int b = 1;
}
 interface Flyable {
     int a = 1;
     int b = 1;

     static int horizontalDegree() { //Line n1
         return 20;
     }

     default void fly() {
         System.out.println("Flying at " + horizontalDegree() + " degrees."); //Line n2
     }

     class m implements Flyable, Flyable1 {
         public static void main(String[] args) {
             System.out.println(a);
             System.out.println(Flyable.b);
         }

         public void show() {
             System.out.println(m.a);
//        System.out.println(m.b);  // error, b is ambugious because both parent have
             m m1 = new m();
             System.out.println(m1.a); // có thể dùng interface instance để gọi thuộc tínnh static final
             m1.fly(); // phải dùng instance để gọi method thường và method dèault
//        m.horizontalDegree();  // chỉ có thể dùng interface name để gọi static method
         }

     }
 }

interface I1 {
    public static void print(String str) {
        System.out.println("I1:" + str.toUpperCase());
    }

    void showsad();
    default void showsad1(){

    }
}
abstract class Er {
   static  public void showBane() {

    }
}
class C1 extends Er implements I1 {
    public void print(String str) {
        System.out.println("I1:" + str.toUpperCase());
    }

//    public void showBane() {
//
//    }

    public void showsad() {

    }

    public void showsad1() {

    }

}



