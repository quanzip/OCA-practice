package com.oca.Abstract.package2;

import com.oca.Abstract.package1.ClasstestMethod;

public class TestClass extends ClasstestMethod {

    // Kiểu protected của phương thức được kế thừa này ăn theo phương thức cha ở class cha
    // để có thể kế thừa, method cha phải là public hoặc protected, Nếu để package (error) kiểu package cho abstract method
    // thì compile sẽ báo lỗi do conflict
    @Override
    protected String showNOthing() {
        return null;
    }

    @Override
    protected void packageMethod() {

    }

    @Override
    public void showInfo1() {

    }
}
