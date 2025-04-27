package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.BigTest1;

public class Bai25 {
    public static void main(String[] args) {
        Bai25 bai25 = new Bai25();
        try {
            bai25.m1();
        } catch (Ex ex) {
            ex.printStackTrace();
//            bai25.m1();
            throw new Exception("");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Ads");
            return;
        }
    }

    public void m1() throws Ex {
        throw new Ex();
    }
    public void m2() {
        throw new RuntimeException();
    }
}

class Ex extends Exception {}
