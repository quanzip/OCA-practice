package com.oca.method_encapsulation.pack2;

import com.oca.method_encapsulation.pack1.Class11;

public class TestProtected {
    public static void main(String[] args) {
        Class11 class11 = new Class11();
//        class11.a = "";  // không thể truy cập do A là package private, chỉ có thể truy cập bên trong package và các class con của Class11.
    }
}
