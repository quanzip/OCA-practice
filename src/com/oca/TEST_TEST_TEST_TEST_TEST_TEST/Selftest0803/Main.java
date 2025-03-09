package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.Selftest0803;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int y;
        OK:  y = 10;            // ok
         // OK1: int g = 10;    // loi
        // Lable chi co the dai dien cho 1 statement, loop
        /*
        * if (false) do-while(false) ok, for/while(faile) not ok
        *
        * trong 1 file, cap class ngoai cung chi co 1 class la public, class do phai trung voi File Name
        * cac class cung cap khac khong duoc la static ma chi co the la package hoac public, k dc protected
        * Cac class con co the la tat cac (public private protected package static)
        *
        * this(X) phai la dong dau tien cua constructor,
        *  X nau la class var/method thi phai la static, neu la method's var thi ko can static
        * */

        // cac thuoc tinh trong interface luon la public + final => khong the thay doi GT

        // Khi A ke thua B, trong B co 1 var/pt protected => var/phuong thuc do se tro thanh private trong A (chi co the sd o torng A thoi.)
        // Khi A ke thua B, Neu B dinh nghia tuong minh >=1 cons thi A phai goi 1 trong so cac cons do,
        // neu B ko dinh nghia thi mac dinh Jvm se tu goi no-arg cua B khi khoi tao A

        final int t = 10;
//        while (t < 0) {
//           Error because t is final so JVM resolve while expression at compile-time
        // if t is not final => no error
//        }

        // khi dem cac doi tuong da duoc khoi tao, phai dem ca cac phan tu da gan GT hoac chua.
        // String va int deu duoc cache lai khi sd intern("") hoac valueOf

        /*
        * Enum laf final cho var, cons, method, khong the thay doi, khong the ke thua
        * ban than enum cung dala final, k the ke thua no, no cuxng ko the ke thua ai
        * */


    }


    static class Quan {
        // ok
    }

    public Main(int number, String name) {
        this(name1); // chi co the sd name1 trong this khi name1 la static
    }

    static String name1;
    public Main(String name) {
        // this(name);   error => recursive constructor
    }

    public Main() {
    }
}

//static class Quan {
//   // error cap ngoai cung khong the la static,
//}

//protected class Quan1 {
//    Error  // cap ngoai cung chi co the la public hoajc package (default)
//}


class A {
    public void go() throws FileNotFoundException {

    }

    public void see() throws IOException {

    }
}

class B extends A {
    /*@Override
    public void go() throws IOException {  // error: khong duoc throw ex lon hon cha

    }*/

    @Override
    public void see() throws FileNotFoundException {
        // OK vi FileNotfoundException la con cua IOException
    }
}

interface D {
    abstract void show();
    abstract void keen();
    default void see() {

    }
}
abstract class F implements D {
    // abstract class se implement interface, interface se extends interface
    // co the implenents cac abstract PT cua cha hoac khong

    @Override
    public void show() {

    }
}

// da ke thua
interface DD {
    default void see() {
    }
}
class DE implements D,DD {

    @Override
    public void show() {
        DD.super.see();
    }

    @Override
    public void keen() {

    }

    // day la phuong thuc default o ca 2 INterface cha,
    // nen phai kia thua laji, neu ko muon ke thua thi 1 trong 2 cha phai doi lai method signature
    @Override
    public void see() {

    }
}

class DS implements DD {
    DS() {
        see();
        DD.super.see();  // dung khi interface cha cung co phuong thuc see()
        // khong the goi nhu nay neu DD la ong noi hoac cao hon
    }

    public void see() {

    }
}
class DDDS {
    public void testDS() {
        DS ds = new DS();
        ds.see();
    }
}

