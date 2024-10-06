package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.AbstractLogoc;


// Main is a hello
// also, Main is a Moveable,
// also, Main is a Loveable

// interfaces can contain keyword: abstract without any problems

public class Main extends Helo implements Moveable, Loveable{
    public static void main(String[] args) {
        Helo helo = new Helo() {
            @Override
            public void showName() {

            }
        };
        helo.showName();
    }

    @Override
    public void showName() {

    }

    @Override
    public String goDirection() {
        return null;
    }

    @Override
    public String howLove() {
        return null;
    }
}
abstract class Helo {
    public abstract void showName();
}
abstract interface Moveable {
    String goDirection();
}
abstract interface Loveable {
    String howLove();
}