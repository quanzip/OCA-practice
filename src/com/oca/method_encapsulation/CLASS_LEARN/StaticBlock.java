package com.oca.method_encapsulation.CLASS_LEARN;

public class StaticBlock {
    static { // static block
        System.out.println("static block A");
    }
    String name;

    { // instance block
        int f = 1_00_00;
        System.out.println("instance block A" + name);
    }

    // thứ tự khai báo của instance variable và instance method sẽ theo thứ tự của chúng được đặt ở trong file.
    // =?> không thể sử dụng instance variable ở instance method bên trên sự khai báo của chúng

    StaticBlock(String name) {
        System.out.println("Constructor A" + name);
    }

    public static void main(String[] args) {
        StaticBlock s = new StaticBlock("");  // initial by order: SIC =>  static - instance - constructor
        System.out.println("-----------------------------");
        S s1 = new S("S value");
    }



}

class S extends C{
    static {
        System.out.println("static block S");
    }

    {
        System.out.println("instance block S");
    }


    C c1 = new C("normal instance in S");
    static C c = new C("static instance in S");

    S(String name) {
        super(name);
        System.out.println("Constructor S");
    }
}

class C {
    static {
        System.out.println("static block C");
    }
    {
        System.out.println("instance block C");
    }
    C (String name) {
        System.out.println("Constructor in C: " +name);
    }
}
