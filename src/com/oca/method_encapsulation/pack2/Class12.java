package com.oca.method_encapsulation.pack2;

import com.oca.method_encapsulation.pack1.Class11;

// để có thể extend Class11 đang ở 1 package khác, Class11 phải là public, nếu không,  sẽ không thể extends,
// 1 class lúc khai báo chỉ có thể để là public hoặc package (không để gì, chỉ đơn giản là class NameXXX)
// => nếu muón extends 1 class X ở 1 package khác thì X phải là dạng public, nếu không chỉ có thể extends X từ class
// trong cùng package đó.
public class Class12 extends Class11 {
    Class12 () {
        // Nếu bên class cha Class11 có khai báo constructor, thì class con này cũng phải gọi tới constructor của cha
        // Nếu bên cha không khai báo bất kỳ constructor, => sử dụng constr() không tham số JVM tự truyền vào, thì ở class
        // con này constrc() của cha cũng tự động được gọi,
        super(1);
        a = 1; // from super class
    }

    void setSuperProperties (int value) {
        a = value;

        Class11 class11 = new Class11(a);
//        class11.a = 100;   không dùng được do đây là instance được khai báo bên ngòai package của class 11 mà a
        // là protected nên chỉ cho sd bên trong class con và trong cùng package
    }

    @Override
    public void showInfo() {
        System.out.println("Class12");
    }

    public static void main(String[] args) {
        Class11 class12 = new Class12(); // polymorphism
    }
}
