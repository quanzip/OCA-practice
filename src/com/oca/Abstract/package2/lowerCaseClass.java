package com.oca.Abstract.package2;

public class lowerCaseClass {
    public void randomMethod() {
        new lowerCaseClass();

        int x = 10;
        int y;
        // int z = x + y; // Lỗi do Y chưa được khai báo.

        int a;
        if (x == 10) {
            a = 1;
        } else {

        }
        // System.out.println(a);   //Error Do a chưa được khởi tạo và trong các nhánh code thì a cũng chưa được gán.

        boolean legal; // không thể gán null cho kiểu primitive
       //  System.out.println(legal); // legal chưa được khai báo.

        // =>>>> Đối với kiểu PRIMITIVE, không thể được sử dụng trong mọi ngữ cảnh: tính toán, In ra NẾU chưa được gán giá trị
    }
}
