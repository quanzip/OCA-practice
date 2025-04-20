package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.BigTest1;
/*
* Phương thức defualt của interface có thể được kế thừa hoặc ko, nếu như con khai báo phương thức giống signature
*  của phương thức default của interface thì đang là kế thừa
*
* Nếu phương thức kế thừa lại khai báo là static thì ko được do phương thức default dành cho instance, còn static method là của refernce
*
* Không kể là interface hay class thường, nếu kế thừa nhau và dều có PT static giống nhau thì ok, ko sao do PT static thì ko thể được kế thừa
* */
public class Bai13 {
    public static void main(String[] args) {

    }
}

interface X {
    default void show() {
        System.out.println("Default x");
    }
}


interface Y extends X {
//    static void show() {   // not ok
//        System.out.println("Default y");
//    }

    default void show() {  // ok
        System.out.println("Default Y");
    }

    static void get() {   // not ok
        System.out.println("Default y");
    }
}

class C implements Y {
    static void get() {  // ok
        System.out.println("Static C");
    }

}
