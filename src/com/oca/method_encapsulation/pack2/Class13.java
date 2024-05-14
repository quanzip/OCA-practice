package com.oca.method_encapsulation.pack2;

import com.oca.method_encapsulation.pack1.Class11;

public class Class13 extends Class12 {
    public Class13(int value) {
       setSuperProperties(value);
       a = 100;   // a là property ở Class11 - ông nội của class13 => Class13 là sub, nên có
        // thể truy cập trực tỉép

        Class11 class11 = new Class11();
//        class11.a = 100; //  Do đang khai báo 1 instance mới không cùng package
        // , và a là package private
        // nên không thể truy cập a

        Class12 class12 = new Class12();
//        class11.a // không thể truy cập vì lúc này a trở thành private trong Class12
    }

    public static void main(String[] args) {
        Class13 class13 = new Class13(1);
        class13.a = 1; // Do vẫn đang ở trong Class13.
    }
}
