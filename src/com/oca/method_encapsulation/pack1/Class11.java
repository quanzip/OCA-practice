package com.oca.method_encapsulation.pack1;

import com.oca.method_encapsulation.pack2.Class12;

public class Class11 {
    protected int a;

    public Class11(int a) {
        this.a = a;
    }

    public void showInfo() {
        System.out.println("class11");
    }

    protected void protectedMethod() {
        System.out.println("super protected method");
    }
}