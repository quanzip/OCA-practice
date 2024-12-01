package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.QUESTION;

import java.util.Enumeration;

public class Constructor_With_args {
    public static void main(String[] args) {
        String name = "Quan";
        System.out.println(name);
    }
}

class Animal1 {
    static String name;
    static int numLeg;
    boolean isOk;

    public Animal1() {
        this(name, numLeg);    // errror vì numleg không phải static => trong this([args]) thì các args phải là static var/methods.
        isOk = true;
    }

    public void showName(){
        System.out.println(name);
    }

    public Animal1(String name, int numLeg) {
        this.name = name;
        this.numLeg = numLeg;
    }
}
