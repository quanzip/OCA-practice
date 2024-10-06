package com.oca.method_encapsulation.pack2;

import com.oca.method_encapsulation.pack1.Class11;

// để có thể extend Class11 đang ở 1 package khác, Class11 phải là public, nếu không,  sẽ không thể extends,
// 1 class lúc khai báo chỉ có thể để là public hoặc package (không để gì, chỉ đơn giản là class NameXXX)
// => nếu muón extends 1 class X ở 1 package khác thì X phải là dạng public, nếu không chỉ có thể extends X từ class
// trong cùng package đó.
/*
* nẾU cha E có 1 phương thức protected P, có các Class con x,y kế thừa E, các class con khác B, J kế thừa lần lượt x,y
* THÌ PHƯƠNG THỨC P NÀY SẼ TRỞ THÀNH PRIVATE TRONG MỖI SUBCLASS (X, Y) VÀ SUBSUBCLASSES(B, J) -> chỉ được sd bên trong mỗi subClass và SubSubClass đó
*  NGOẠI TRỪ: có thể truy cập P từ việc khởi tạo instance của subClass(x,y) và SubSubClass(B, j) bên trong chính những class subClass(x,y) và SubSubClass(B, j) này
* xem tại dòng 28, 29    ,, 58,59
*
* */
public class Class12 extends Class11 {
    Class12 () {
        // Nếu bên class cha Class11 có khai báo constructor, thì class con này cũng phải gọi tới constructor của cha
        // Nếu bên cha không khai báo bất kỳ constructor, => sử dụng constr() không tham số JVM tự truyền vào, thì ở class
        // con này constrc() của cha cũng tự động được gọi,
        super(1);
        a = 1; // from super classs
    }

    void setSuperProperties (int value) {
        a = value;
        Class12 class12 = new Class12();
        class12.a = 034;   // ok
        class12.protectedMethod(); // ok

        Class11 class11 = new Class11(a);
//        class11.a = 100;   không dùng được do đây là instance được khai báo bên ngòai package của class 11 mà a
//        class11.protectedMethod();
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

class Class121 extends Class12{

    public Class121(int a) {
        super();
        a = 100;   // inherit -> ok
    }

    public void showInfo() {
       Class12 class12 = new Class12();
       //  class12.a  =1;   // not ok because a become private

        Class121 class121 = new Class121(19);
        class121.a = 1000;   //ok when declaring instance of subclass inside them self,
    }
}
