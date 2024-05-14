package com.oca.method_encapsulation.pack2;

import com.oca.method_encapsulation.pack1.Class11;

// để có thể extend Class11 đang ở 1 package khác, Class11 phải là public, nếu không,  sẽ không thể extends,
// 1 class lúc khai báo chỉ có thể để là public hoặc package (không để gì, chỉ đơn giản là class NameXXX)
// => nếu muón extends 1 class X ở 1 package khác thì X phải là dạng public, nếu không chỉ có thể extends X từ class
// trong cùng package đó.
public class Class12 extends Class11 {
    Class12 () {
        a = 1; // from super class
    }

    void setSuperProperties (int value) {
        a = value;
    }

    @Override
    public void showInfo() {
        System.out.println("Class12");
    }

    public static void main(String[] args) {
        Class11 class12 = new Class12(); // polymorphism
    }
}
