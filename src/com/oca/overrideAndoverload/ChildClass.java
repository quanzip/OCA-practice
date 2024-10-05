package com.oca.overrideAndoverload;

import java.util.Random;

public class ChildClass extends SupperClass {
    @Override
    Object getANumber(int a, String b) {
        int i = new Random().nextInt(10);
        System.out.println(i);
        return i;
    }


    // important: đây là phương thức kế thừa của cha nhưng có kiểu trả về khác, và accessmodifier cũng khác, vậy khác như nào vẫn là hợp lêk:
    // kiểu trả về phải là kiểu con hoặc kiểu nhỏ hơn hoặc bằng của cha,  access-modifier phải là kiểu mở hơn của cha
    @Override
    protected String getParent(Integer x) {
        return null;
    }


    public void showInfo() {
        System.out.println("Quanzip");
    }


    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();
        childClass.showInfo(); // class of ChildClass its self
        childClass.showInfo("QuanZip");  // MEthod of super class
    }
}
