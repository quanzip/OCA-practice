package com.oca.overrideAndoverload;

import java.util.Random;

public class ChildClass extends SupperClass {
    @Override
    Object getANumber(int a, String b) {
        int i = new Random().nextInt(10);
        System.out.println(i);
        return i;
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
