package com.oca.Constructor;

public class EmptyClass {
    // if we do not declare any thing, compiler will automatically create empty constructor and add super() in it.
//    EmptyClass() {
//        super();
//    }  ==> auto insert by compiler

    EmptyClass() {
        super(); // auto instert by compiler
    }

    /**
     * ok
     */
    public void EmptyClass() {
        System.out.println("This method has same name with class but it is not a constructor and still valid");
    }

    void go(){
        this.EmptyClass();
    }
}
