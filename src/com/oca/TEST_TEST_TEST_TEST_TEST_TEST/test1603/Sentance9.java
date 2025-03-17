package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.test1603;

public class Sentance9 {

    private final double r;
    // khi đã khai thuộc tính final thì phải gán giá trị ngay hoặc
    // phải gán trong constructor hoặc trong static block
    double rr;
    static {
//        r = 1;  only if r la static
    }

    Sentance9() {
        r = 1;
    }

    public void setShort(short ddd) {  // short
        rr = ddd;
    }
    public void setRR(long ddd) {   // long
        rr = ddd;
    }

    public static void main(String[] args) {
        Sentance9 e = new Sentance9();
        e.setRR(90);  // ok auto cast  to Long, vi 90 se tu hieu la Int, ma int < long la tham so cua ham => OK

        e.setShort((short)90); // error vi 90 la int, co the vuot qua range kieu short cua ham
        // nen phai cast ve short
    }
}
