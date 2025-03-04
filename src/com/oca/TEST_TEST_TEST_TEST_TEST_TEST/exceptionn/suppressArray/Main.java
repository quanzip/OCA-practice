package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.exceptionn.suppressArray;

public class Main {
    public static void main(String[] args) {

        try(MyHome mh = new MyHome("Quan"); MyHome1 mh1 = new MyHome1("Toan")) {
           throw new Exception("try exception");   // this will become the main exception and being catched below at A line
        } catch (Exception e) {
            System.out.println(e.getMessage()); // A

            // two other exception throw by implicit finally block are keep here
            for(Throwable t: e.getSuppressed()) {
                System.out.println(t);
            }

            System.out.println("-----Another normal try-catch inside try-with-resources");
            try {
                throw new Exception("try-catch normal exception");
            } catch (Exception e1) {
                System.out.println(e1);
            }

        } finally {
            System.out.println("Finally");
        }

    }
}

class MyHome implements AutoCloseable{
    String name;

    public MyHome(String name) {
        this.name = name;
    }

    @Override
    public void close() throws Exception {
        throw new Exception("Myhome");
    }
}

class MyHome1 implements AutoCloseable{
    String name;

    public MyHome1(String name) {
        this.name = name;
    }

    @Override
    public void close() throws Exception {
        throw new Exception("Myhome1");
    }
}
