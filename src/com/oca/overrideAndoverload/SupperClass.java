package com.oca.overrideAndoverload;

import java.util.Random;

public abstract class SupperClass {
    Object getANumber(int a, String b) {
        int i = new Random().nextInt(10);
        System.out.println(i);
        return i;
    }

    public String showInfo(String input) {
        System.out.println(input);
        return input;
    }

    abstract Object getParent(Integer x);
}
