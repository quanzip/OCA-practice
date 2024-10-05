package com.oca.method_encapsulation.pack2;

public class Class14 {
    public static void main(String[] args) {
        Class13 class13 = new Class13(1);
//        class13.a // khi  đã ở ngoài Class13 => thuộc tính a sẽ tương đương private, khiến nó không
        // thể được truy cập. do đây không phải cùng package với class11, nơi chứa biến a
    }
}
