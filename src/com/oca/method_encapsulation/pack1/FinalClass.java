package com.oca.method_encapsulation.pack1;

public class FinalClass {
    public static void main(String[] args) {
       final X x =new X();
        x.t = 9 ;


    }
}


final class X  {
    int t = 0;
}


class Y  { // extends X{ // Error because X is final

}