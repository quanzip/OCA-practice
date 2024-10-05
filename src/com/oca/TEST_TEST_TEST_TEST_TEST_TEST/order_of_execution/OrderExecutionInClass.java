package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.order_of_execution;


// Khối static trong 1 class sẽ luôn đuọc chạy khi class được load, nhưng chỉ chjay duy nhất 1 lần
public class OrderExecutionInClass {
    public static void main(String[] args) {
        B b = new B();  // SIC
        A a = new A();  // => Instance A1 constructor A
    }

}

class A {
    static {
        System.out.println("Static A1");
    }


    {
        System.out.println("Instance A1");
    }

    public A() {
        System.out.println("constructor A");
    }


    static {
        System.out.println("Static A2");
    }

}

/*static B1

* static A1
* Static A2
* instance A1
* Constructor A
*
* instance A1
 Constructor A

 Instance B1

 instance A1
 Constructor A

 constructor B

 instance A1
 Constructor A
*
* */



class B {
    {
        System.out.println("Instance B1");
    }

    public B() {
        System.out.println("constructor B");
    }

    static {
        System.out.println("Static B1");
    }

    static A a = new A();
    A a1 = new A();
    static A a2 = new A();
}
