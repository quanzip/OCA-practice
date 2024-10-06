package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.interfaces;

/*
* interface is can only have public method,
* can not declare instance variable in interface, only static final
*
* 1 object không thể kế thừa interface được định nghĩa bên trong chính bản thân chúng (subInterface).
* - Từ khóa static chỉ có thể dùng cho class/interface con ở trong 1 class/interface cha
* Có thể sử dụng từ khóa abstract cho các method hoặc không bên trong interface. vì mặc định chúng là abstract
*
* Abstract class khi muốn kế thừa interface phải dùng từ khóa implements, abs class này không cần implemtns các phương thức trừu tượng của interface
* */

public class ComponentIninterface{
    public static void main(String[] args) {
        AbstractC ab = new AbstractC("quan") {
            @Override
            public String getName() {
                System.out.println(getName());
                return super.getName();
            }

            @Override
            public void showName() {
                System.out.println("show name from quick abstract class implementation");
            }
        };
        ab.showName();
    }

    // sub interface
    public static interface SubInterface {
        int a = 100;

        default String getName() {
            // a = 1000; error because all variable in interface are static final
            return "Quanzip";
        }

        void showName();
    }

}
class Car implements ComponentIninterface.SubInterface{
    @Override
    public void showName() {

    }
    Car(){
        getName();
    }
}

abstract class AbstractC implements ComponentIninterface.SubInterface {
    AbstractC(String a) {
        showName();
    }

    @Override
    public void showName() {
        System.out.println("override method from original class");
    }
}
