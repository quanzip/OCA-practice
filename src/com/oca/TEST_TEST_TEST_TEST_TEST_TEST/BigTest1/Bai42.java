package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.BigTest1;

import sun.awt.util.IdentityLinkedList;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Bai42 {
    public static void main(String[] args) {
        int[] a, a1[];
        int[][] b = null;  // ok
        int c[] = null;    // ok
//        int d = null;   // error
//        long l = null;  // error
        a1 = b;  // error vi B chua khai bao, phai khoi tao hoac gna bang null mooi co the dung.
        new Double(45.7);


//        for và while dùng như này sẽ lôi
//       for (;false;){
//           System.out.println("sd");
//       }
//       while (false) {
//           System.out.println("asdoj");
//       }

        if (5 == 10) {  // ok
            System.out.println("ok");
        }

//        for(;true;)  //ok
//        {
//            System.out.println("asoijd");
//        }
//
        while (true) {
            System.out.println("s");
//        }

//        for (;5 == 10;) {
//            System.out.println("ok");
//        }

        }
    }
}

abstract class B {
     // private abstract void show() { error, abstract method can not be private

//    }

    protected void getInfo() throws IOException, IllegalArgumentException {

    }
}
abstract class A extends B {
     // private abstract void show() { error, abstract method can not be private

//    }

    protected void getInfo() throws IOException, FileNotFoundException, IllegalArgumentException {

    }
}
