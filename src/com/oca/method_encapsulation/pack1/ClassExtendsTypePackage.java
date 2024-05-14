package com.oca.method_encapsulation.pack1;

import com.oca.method_encapsulation.pack2.Class13;

class ClassExtendsTypePackage extends ClassTypePackage { // no problem because ClassTypePackage has package modifier => ok
    public static void main(String[] args) {
        Class11 class11 = new Class13(1);
        class11.a = 199;
    }
}
